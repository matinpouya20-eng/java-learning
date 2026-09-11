import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> students =
                new HashMap<>();

        students.put(101, "Pouya");
        students.put(102, "Ali");
        students.put(103, "Reza");

        int id = 102;

        String studentName =
                students.get(id);

        System.out.println(
                "Student: " + studentName
        );
    }
}