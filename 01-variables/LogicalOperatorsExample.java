public class LogicalOperatorsExample {

    public static void main(String[] args) {

        int age = 22;
        boolean hasTicket = true;
        boolean isVIP = false;

        System.out.println("Adult and has ticket: " + (age >= 18 && hasTicket));

        System.out.println("VIP or has ticket: " + (isVIP || hasTicket));

        System.out.println("Not VIP: " + (!isVIP));

        boolean canEnter = age >= 18 && hasTicket;

        System.out.println("Can enter: " + canEnter);
    }
}