import java.util.*;

public class CollegeApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Applicant name");
        String name = sc.nextLine();

        System.out.println("Marks obtained in HSC");
        int marks = sc.nextInt();

        System.out.println("Total possible marks in HSC");
        int totalMarks = sc.nextInt();

        System.out.println("Engineering cutoff mark");
        float cutoff = sc.nextFloat();

        System.out.println("Marks obtained in SSLC");
        int sslcMarks = sc.nextInt();

        System.out.println("Total possible marks in SSLC");
        int totalSslcMarks = sc.nextInt();

        System.out.println("Gender");
        char gender = sc.next().charAt(0);




    }



}
