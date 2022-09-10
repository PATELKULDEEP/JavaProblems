import java.util.Scanner;

public class LudoGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = 0;
        boolean check = true;

        while (check) {
            System.out.println("Alex");
            int alex = sc.nextInt();
            if(score("alex",alex)) {
                break;
            }
            System.out.println("Sam");
            int sam = sc.nextInt();
            if(score("Sam",sam))
                break;

            System.out.println("Brain");
            int brain = sc.nextInt();
            if(score("Brain",brain))
                break;

        }





    }
    static boolean score(String name, int score) {

        if(score < 0 || score > 50){
            System.out.println(score+" is an invalid number");
            return true;
        }

        return false;
    }
}
