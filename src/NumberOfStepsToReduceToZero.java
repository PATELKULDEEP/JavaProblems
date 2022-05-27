import java.util.Scanner;

public class NumberOfStepsToReduceToZero {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        System.out.println("No of Steps to Reduce to Zero is : "+numberOfSteps(num));

    }
    public static int numberOfSteps(int num){
        int count = 0;
        while(num != 0){
            if(num % 2 == 0){
                num = num/2;
                count++;
            }
            else{
                num = num-1;
                count++;
            }
        }
        return count;
    }

}
