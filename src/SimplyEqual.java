import java.util.Scanner;

public class SimplyEqual {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for (int i = 0; i < T; i++) {

            int N = input.nextInt();
            int[] A = new int[N];
            A[0] = input.nextInt();
            int min = A[0];
            int max = A[0];
            for (int j = 1; j < N; j++) {
                A[j] = input.nextInt();
                if(min > A[j]){
                    min = A[j];
                }
                if(max < A[j]){
                    max = A[j];
                }
            }
            int ans = max - min;


            System.out.println(ans);

        }
    }
}

//
//            int avg = (sum / N);
//            if(sum%2 != 0){
//                avg = avg + 1;
//            }
//            int ans = 0;
//            for (int k = 0; k < N; k++) {
//                if (A[k] > avg) {
//                    ans = ans + (A[k] - avg);
//                } else if (A[k] < avg) {
//                    ans = ans + (avg - A[k]);
//                }
//            }
//