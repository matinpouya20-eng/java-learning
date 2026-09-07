public class LogicalOperatorsExample {

    public static void main(String[] args) {

        int age = 22;
        boolean hasTicket = true;
        boolean isVIP = false;

        boolean canEnter = age >= 18 && hasTicket;

        System.out.println("Can enter: " + canEnter);

        boolean specialAccess = isVIP || hasTicket;

        System.out.println("Special access: " + specialAccess);

        System.out.println("Not VIP: " + !isVIP);
    }
}