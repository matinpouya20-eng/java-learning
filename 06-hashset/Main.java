{import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> ipAddresses = new HashSet<>();

        ipAddresses.add("192.168.1.10");
        ipAddresses.add("192.168.1.20");
        ipAddresses.add("192.168.1.10");
        ipAddresses.add("192.168.1.30");

        System.out.println("IP Addresses:");
        System.out.println(ipAddresses);

        System.out.println("Number of unique IPs: "
                + ipAddresses.size());

        System.out.println("Is 192.168.1.20 exists? "
                + ipAddresses.contains("192.168.1.20"));
    }
}
    
}
