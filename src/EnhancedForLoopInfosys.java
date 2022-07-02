import java.util.Scanner;

public class EnhancedForLoopInfosys {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        for(int marks : arr){
            arr[marks] = input.nextInt();
        }
        for(int marks : arr){
            System.out.println(marks);
        }

    }

}
