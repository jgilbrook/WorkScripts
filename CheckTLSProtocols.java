// needed to check supported tls versions across a product upgrade
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;

public class CheckTLSProtocols {
    public static void main(String[] args) {
        try {
            SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, null, null);
            SSLParameters sslParameters = sslContext.getSupportedSSLParameters();
            String[] supportedProtocols = sslParameters.getProtocols();

            System.out.println("Supported SSL/TLS protocols:");
            for (String protocol : supportedProtocols) {
                System.out.println(protocol);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
