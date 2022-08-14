/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class GoalForX
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for(int i=0;i<T;i++){
            int N = input.nextInt();
            int X = input.nextInt();

            int[] A = new int[N];
            int sum = 0;
            for(int j=0;j<N;j++){
                A[j] = input.nextInt();
                sum += A[j];
            }
            int mean = sum/N;

            Arrays.sort(A);

            int ans = mean - A[X-1];


            System.out.println(ans);
        }
    }
}
