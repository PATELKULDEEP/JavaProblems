import java.util.Scanner;

public class NumberOfOneBits {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 32 bit Number : ");
        int n = input.nextInt();
        System.out.println(hammingWeight(n));

    }
    public static int hammingWeight(int n){

        int res=0;
        while(n!=0){
            n = n & (n-1);
            res++;
        }
        return res;
    }

}
