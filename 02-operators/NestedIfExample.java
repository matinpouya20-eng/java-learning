public class NestedIfExample {
    public static void main(String[] args) {
        int age = 22;
        boolean hasticket = true;

        if (age >= 18) {
            if (hasticket) {
                System.out.println("you can enter");
            } 
            else{
                System.out.println("you need a ticket");
            }

        }
             else{
                System.out.println("you are too young");
             }
                
            
        

    }
    
}
