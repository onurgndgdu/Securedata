import javax.net.ssl.*;
import java.io.*;
import java.security.*;
public class SecureFileServer {
    public static void main(String[] args) throws Exception{

        int port = 1234;

        char[] keystorePass = "keystorepass".toCharArray();
        KeyStore keyStore = KeyStore.getInstance("JKS");
        FileInputStream keyStoreFile = new FileInputStream("serverkeystore.jks");
        keyStore.load(keyStoreFile,keystorePass);


    }
}
