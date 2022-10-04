import java.util.Scanner;

public class FitToPlayCodeChef {

    public static void main(String[] args) {
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- >0) {

                int n = sc.nextInt();

                int max = 0, min = 0;
                int a[] = new int[n];

                for (int i = 0; i < n; i++) {

                    a[i] = sc.nextInt();

                    if (a[i] < min || i == 0) {
                        min = a[i];
                    }
                    int value = a[i] - min;
                    if (value > max) {
                        max = value;
                    }
                    System.out.println("min " + min + "   max " + max);
                }

                if (max > 0) {
                    System.out.println(max);
                } else {
                    System.out.println("UNFIT");
                }

            }
        }
    }

}
