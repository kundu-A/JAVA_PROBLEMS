import java.net.*;
public class GetIPAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip=InetAddress.getLocalHost();
        System.out.println("My IP address is: "+ip.getHostAddress());
    }
}
