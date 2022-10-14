import java.util.Scanner;

public class RangeSumQuery2RelevelExam {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int q = sc.nextInt();
            long l = sc.nextInt();
            long r = sc.nextInt();

            while(q-- > 0){
                long x = sc.nextInt();
                long y = sc.nextInt();
                int check = 0;
                long sum = 0;
                for(long i = r ;i > l ;i--){

                    float n = i - l + 1;
                    sum = (long) (( n/2)*(l + i));

                    if(sum >= x && sum <= y){
                        System.out.println("1");
                        check = 1;
                        break;
                    }
                    if(sum < x){
                        break;
                    }

                }
                if(check == 0){
                    System.out.println("0");
                }


            }

        }


    }
}

