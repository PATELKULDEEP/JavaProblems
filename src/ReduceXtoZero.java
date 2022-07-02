import java.util.Scanner;

public class ReduceXtoZero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        System.out.println("Enter the array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter x : ");
        int x = input.nextInt();
        System.out.println( minOperations(arr,x));

    }
    public static int minOperations(int[] nums, int x) {

        int count = 0;



        return -1;
    }

}
