import java.util.Scanner;

public class ChefWireFrame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String exception = sc.nextLine();
        for(int i=0;i<t;i++){
            String s = sc.nextLine();
            String[] arr = s.split(" ",3);
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            int x = Integer.parseInt(arr[2]);

            int price = ((2*n)+(2*m))*x;

            System.out.println(price);

        }
    }

}
