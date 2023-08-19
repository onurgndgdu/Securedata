# Securedata
keystorePass:
keystorePass değişkeni, keystore dosyasının şifresini temsil eder. Keystore, özel anahtarlar ve sertifikalar gibi güvenlik materyallerini saklamak için kullanılır. Bu şifre, keystore dosyasını açmak ve içeriğine erişmek için kullanılır.

KeyStore:
KeyStore sınıfı, güvenlik materyallerini (örneğin, özel anahtarlar ve sertifikalar) saklamak ve yönetmek için kullanılır. Bu sınıf, anahtar yönetimi ve sertifika tabanlı güvenlik için kullanılır. KeyStore nesnesi, özel anahtarları ve sertifikaları depolayan ve koruyan bir veritabanıdır.

keystoreFile:
keystoreFile, keystore dosyasının diskteki yolu veya yolunu temsil eder. Bu dosya genellikle .jks uzantısına sahip olur ve güvenlik materyallerini içerir.

KeyManagerFactory:
KeyManagerFactory, KeyManager'ların oluşturulmasını ve yönetilmesini sağlar. KeyManager'lar, sunucu tarafındaki güvenlik kimliklerini yönetmek için kullanılır. Bu kimlikler, sunucunun kimliğini doğrulama ve güvence altına alma amacıyla kullanılır.

SSLContext:
SSLContext, güvenli bağlantı kurmak için gereken güvenlik parametrelerini ve protokollerini yönetir. Bu bağlam, güvenli veri iletimi için gerekli olan şifreleme, kimlik doğrulama ve güvenlik katmanı protokollerini belirler.

SSLServerSocketFactory:
SSLServerSocketFactory, sunucu tarafındaki güvenli soketleri oluşturmak için kullanılır. Bu fabrika, sunucu tarafında gelen bağlantıları kabul etmek ve güvenli iletişim için gerekli ayarları yapmak için kullanılır.

serverSocket.accept():
Bu kod parçası, sunucu tarafında gelen istemci bağlantılarını kabul eder. Yani istemciler sunucuya bağlandığında bu kısım çalışır.

SSLContext:
SSLContext, güvenli iletişim için gerekli parametreleri ve protokolleri yöneten sınıftır. SSLContext sınıfının getInstance metodu ile belirli bir güvenlik protokolü (örneğin, "TLS") seçilir. init metoduyla güvenlik ayarları ve güvenlik yöneticileri (TrustManager, KeyManager) belirlenir.

TrustManager:
TrustManager, güvenli iletişimde sunucu sertifikalarını veya kök sertifikalarını doğrulamak ve güvenilirliği sağlamak için kullanılan bir arayüzdür. TrustManager sınıfı, sunucu tarafından sunulan sertifikaların güvenilir olup olmadığını kontrol eder.

X509TrustManager:
X509TrustManager, TrustManager arayüzünü uygulayan bir sınıftır ve X.509 sertifikalarının güvenilirliğini doğrulamak için kullanılır. Kod içerisindeki anonim sınıf bu arayüzü uygulamaktadır.

SSLSocketFactory:
SSLSocketFactory, güvenli soketleri oluşturmak için kullanılan bir fabrikadır. SSLContext ile oluşturulan güvenlik ayarları ve protokollerini kullanarak güvenli SSLSocket nesneleri oluşturur.

Socket ve SSLSocket:
Socket, ağ bağlantılarını temsil eden genel sınıftır. SSLSocket, güvenli iletişim sağlayan özel bir Socket alt sınıfıdır. SSLSocketFactory ile oluşturulan bu soketler, güvenli veri iletimini sağlar.

InputStream ve FileInputStream:
InputStream, veri akışını okumak için kullanılan bir soyut sınıftır. FileInputStream, belirli bir dosyayı okumak için kullanılır. Bu örnekte, sunucudan gelen veri akışını okumak ve dosyaya kaydetmek için kullanılır.

OutputStream ve FileOutputStream:
OutputStream, veri akışını yazmak için kullanılan bir soyut sınıftır. FileOutputStream, belirli bir dosyaya veri yazmak için kullanılır. Bu örnekte, dosyadan gelen veriyi alıp dosyaya kaydetmek için kullanılır.

SecureRandom:
SecureRandom, rastgele sayı üretimi için kullanılan bir sınıftır. SSLContext ve diğer güvenlik işlemlerinde rastgele sayıların kullanımını sağlar.
