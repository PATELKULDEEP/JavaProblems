import java.util.Arrays;
import java.util.Scanner;

public class RussianDollEnvelop {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Envelops : ");
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        int[][] newArr = new int[n][n];
        for(int i = 0; i<n;i++){
            for(int j=0;j<2;j++) {

                System.out.print("Enter Length : ");
                int width = input.nextInt();
                arr[i][j] = width;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){

                System.out.print(Arrays.toString(new int[]{arr[i][j]}));
            }
        }

        for(int i=0,j=1;i<n-1;i++,j++){
                System.out.println("testing : "+arr[i][0]);
                System.out.println("Testing i++ "+arr[j][0]);

        }

    }

}
