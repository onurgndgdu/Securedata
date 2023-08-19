import javax.net.ssl.*;
import java.io.*;
import java.net.Socket;
import java.security.*;
public class SecureFileServer {
    public static void main(String[] args) throws Exception{

        int port = 1234;

        char[] keystorePass = "keystorepass".toCharArray();
        KeyStore keyStore = KeyStore.getInstance("JKS");
        FileInputStream keyStoreFile = new FileInputStream("serverkeystore.jks");
        keyStore.load(keyStoreFile,keystorePass);

        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
        keyManagerFactory.init(keyStore,keystorePass);

        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(keyManagerFactory.getKeyManagers(),null,null);

        SSLServerSocketFactory sslServerSocketFactory = sslContext.getServerSocketFactory();
        SSLServerSocket serverSocket = (SSLServerSocket) sslServerSocketFactory.createServerSocket(port);

        System.out.println("Server is listening on port " + port);

        while(true){
            try (Socket socket = serverSocket.accept();
            OutputStream outputStream = socket.getOutputStream();
            FileInputStream fileInputStream = new FileInputStream("samplefile.txt"))
            {
                byte[] buffer = new byte[1024];
                int bytesRead;

                while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                System.out.println("File sent to client.");
            }
            catch (IOException exception) {
                exception.printStackTrace();
            }
        }

    }
}
