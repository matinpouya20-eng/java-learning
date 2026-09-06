public class mystudents {
    public static void main(String[] args) {

      
        String name = "Pouya";
        int age = 20;

      
        double[] grades = {18, 15.5, 9.5, 17, 12, 19, 8};

       
        int numberOfSubjects = grades.length;

      
        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }

        
        double average = sum / numberOfSubjects;

        
        System.out.println("===== Student Information =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Number of subjects: " + numberOfSubjects);

        System.out.println();
        System.out.println("===== Grades =====");

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + grades[i]);
        }

        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // بررسی نمرات
        int failedSubjects = 0;

        for (int i = 0; i < grades.length; i++) {

            if (grades[i] < 10) {
                failedSubjects++;

                System.out.println(
                    "Failed subject: " + (i + 1) +
                    " | Grade: " + grades[i]
                );
            }
        }

        System.out.println();
        System.out.println("Failed subjects: " + failedSubjects);

       
        for (int i = 0; i < grades.length; i++) {

            if (grades[i] >= 9.5 && grades[i] < 10) {
                grades[i] = 10;

                System.out.println(
                    "Subject " + (i + 1) +
                    " grade changed to 10."
                );
            }
        }

       
        sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }

       
        average = sum / grades.length;

        System.out.println();
        System.out.println("===== Final Result =====");
        System.out.println("Final average: " + average);

        
        if (average >= 10 && failedSubjects <= 1) {
            System.out.println("Student Passed.");
        } else {
            System.out.println("Student Failed.");
        }

     
        if (average >= 18) {
            System.out.println("Excellent!");
        } else if (average >= 15) {
            System.out.println("Very Good!");
        } else if (average >= 12) {
            System.out.println("Good.");
        } else if (average >= 10) {
            System.out.println("Passed.");
        } else {
            System.out.println("Needs improvement.");
        }
    }
}

