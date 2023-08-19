import javax.net.ssl.*;
import java.io.*;
import java.net.Socket;
import java.security.*;
import java.security.cert.X509Certificate;

public class SecureFileClient {
    public static void main(String[] args) throws Exception {
        String serverHostname = "localhost";
        int serverport = 1234;

        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null,new TrustManager[]{new TrustManager() {
            public X509Certificate[] getAcceptedIssuers(){
                return null;
            }
            public void checkClientTrusted(X509Certificate[] certificates , String authType){
            }
            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }}, new SecureRandom());

        SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

        try (Socket socket = sslSocketFactory.createSocket(serverHostname,serverport);
             InputStream inputStream = socket.getInputStream();
             FileOutputStream fileOutputStream = new FileOutputStream("receivedfile.txt")){
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("File received from server.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
