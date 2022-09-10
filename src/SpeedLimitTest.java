import java.util.Scanner;

public class SpeedLimitTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String none = sc.nextLine();
        for(int i=0;i<t;i++){
            String s = sc.nextLine();
            String arr[] = s.split(" ",4);
            int a = Integer.parseInt(arr[0]);
            int x = Integer.parseInt(arr[1]);
            int b = Integer.parseInt(arr[2]);
            int y = Integer.parseInt(arr[3]);

            float k = a/(float)x;
            float l = b/y;

            if(k < l){
                System.out.println("Bob");

            }
            else if(k > l){
                System.out.println("Alice");
            }
            else{
                System.out.println("Equal");
            }

        }
    }


}
