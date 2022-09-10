import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println ("Enter the phone number");

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long sumEven = 0;
        long sumOdd = 0;
    String string  = sc.nextLine();
        while(n > 0){

            long value = n%10;

            if(value%2 == 0){
                sumEven = sumEven + value;
            }
            else{
                sumOdd = sumOdd + value;
            }

            n = n/10;
        }



        if(sumOdd == sumEven){
            System.out.println("Sum of odd and even are equal");
        }

        else if(sumOdd > sumEven){
            System.out.println("Sum of odd is greater than sum of even");
        }
        else {
            System.out.println("Sum of even is greater than sum of odd");
        }





    }
}