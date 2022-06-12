import java.util.Scanner;

public class SumOfUniqueValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        System.out.println("Enter the elements -> ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int[] newArr = {187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434};
        System.out.println("The maximum sum is : "+ maximumUniqueSubarray(newArr));
    }

    static int maximumUniqueSubarray(int[] nums) {

        int[] arr = new int[nums.length];

        if(nums.length == 0 ){

            return 0;

        }

        arr[0] = nums[0];

        int count = 1;

        for(int i=1;i<nums.length;i++){
            boolean check = false;

            for(int j=0;j<=i;j++){
                if(arr[j] == nums[i]){
                    check = true;
                    break;
                }
            }
            if(!check){
                arr[count] = nums[i];
                count++;
            }

        }
        int sum = 0;
        for(int j = 0; j < count; j++){
            sum = sum + arr[j];
        }

        return sum;

    }

}
