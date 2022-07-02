import java.util.Scanner;

public class NonDecreasingArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = input.nextInt();
        System.out.println("Enter the values ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = input.nextInt();
        }

        System.out.println(checkArray(nums));

    }
    public static boolean checkArray(int[] nums){

        for(int i=0,count=0;i<nums.length;i++){


        }

        return true;
    }



}
