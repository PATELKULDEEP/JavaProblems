/* package codechef; // don't place package name!

Problem
There are 22 trains AA and BB and NN stations in a line from 11 to NN in order. There is also an array PP of length N-1N−1 such that P_iP
i

  (1\le i \lt N)(1≤i<N) denotes the amount of time any train takes to go from the ii-th station to the (i+1)(i+1)-th station.

Initially, both trains are at station 11. Train AA departs from station 11 and stops directly at station NN. For safety purposes, it is maintained that train BB cannot depart from station ii unless train AA has already reached station (i+1)(i+1) (1 \le i \lt N)(1≤i<N).

Find the minimum time after which train BB reaches station NN, once train AA departs from station 11.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of two lines of input.
The first line of each test case contains an integer NN, denoting number of stations.
The next line contains N-1N−1 space-separated integers, P_1,P_2,\ldots ,P_{N-1}P
1

 ,P
2

 ,…,P
N−1

 .
Output Format
For each test case, output on a new line the minimum time after which train BB reaches station NN.

Test  Case
3
2
4
3
3 5
4
5 2 6

*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class TwoTrainCodeChef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();

        for(int i=0;i<T;i++){
            int N = input.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];

            int minTime = 0,difference = 0,j;

            for( j=1;j<N;j++){
                A[j] = input.nextInt();
                minTime += A[j];
                B[j] = A[j];
                A[j] = minTime;
            }
            for( j=0;j<N-1;j++){
                difference = A[j+1] - B[j];
                if(difference > 0){
                    B[j+1] += B[j] + difference;
                }
                else{
                    B[j+1] += B[j];
                }
            }
            System.out.println(B[j]);


        }
    }
}
