import java.util.Scanner;

public class StairSteps {

   static int x=0;
    int result = 1 ;


    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number of Steps");

        x = input.nextInt();
        steps(0,x);

        System.out.println(count);

    }

    public static int ways(int x){
        if(x <= 0){
            return 0;
        } else if (x == 1) {
            return 1;
        }
        else {

            return factorial(x)/(factorial(2)*factorial(x-2));
        }
    }

    public static int factorial(int fact){
         int value = 1;

        for(int k=1;k<=fact;k++){
            value=value*k;
        }
        return value;
    }
static int count=0;
    public static void steps(int curr,int total){
        if(curr==total){
            count++;
            return;
        }
        if(curr>total) return;
        steps(curr+1,total);
        steps(curr+2,total);
        steps(curr+3,total);

    }
}
