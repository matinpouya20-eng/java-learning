public class grade {
    
    public static void main(String[] args) {

        double score = 17;

        if (score >= 18) {
            System.out.println("Excellent");
        } else if (score >= 15) {
            System.out.println("Good");
        } else if (score >= 10) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}