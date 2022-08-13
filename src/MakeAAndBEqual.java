/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class MakeAAndBEqual
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        for(int i=0;i<T;i++){
            int A = input.nextInt();
            int B = input.nextInt();

            if(A == B){
                System.out.println("YES");
            }
            else if(A > B){

                while(B < A){
                    B*=2;
                }
                if(A == B){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }

            }
            else {

                while(A < B){
                    A*=2;
                }
                if(A == B){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }

            }

        }
    }


}
