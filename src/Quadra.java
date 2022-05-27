import java.util.Scanner;

public class Quadra {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of test case : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int j=0;j<n;j++){
            arr[j] = input.nextInt();
        }

        for(int i=0; i<n;i++){
            System.out.println(checkQuadra(arr[i]));
        }

    }

    public static int checkQuadra(int n){

        for(int i=1;i<n/2;i++){
            for(int j=1;j<=n/2;j++){
                if((i*i*i*i) + (j*j*j*j) == n){
                    return 1;
                }
            }
        }
        return 0;
    }

}
