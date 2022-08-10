import java.util.Scanner;

public class JourneyOfKnight {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0){
            int x1=input.nextInt();
            int y1=input.nextInt();
            int x2=input.nextInt();
            int y2=input.nextInt();
            if((Math.abs(x1-x2)%2==0 && Math.abs(y1-y2)%2==0) || (Math.abs(x1-x2)%2!=0 && Math.abs(y1-y2)%2!=0))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

        }
    }
}
