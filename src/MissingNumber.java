import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Missing Number is : "+ missNumber(arr));

    }
    static int missNumber(int[] nums){

//        int missing = -1;
//        for(int i = 0; i< nums.length; i++){
//            for(int j=0; j< nums.length;j++){
//                if(nums[j] == i){
//                    if(missing == i){
//                        missing = -1;
//                    }
//                    break;
//                }
//                missing = i;
//            }
//            if(missing != -1){
//                return missing;
//            }
//        }
//
//        return missing;
        int sum = nums.length;
        for (int i = 0; i < nums.length; i++)
            sum += i - nums[i];
        return sum;

    }

}
