/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FillArrayRelevel
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for(int i=0;i<N;i++){
            A[i] = input.nextInt();
        }
        for(int j=0;j<N;j++){
            int P = A[j];
            boolean check = true;
            for(int k=0;k<P && k<N;k++){
                if(A[k] >= B[k]){

                }
                else{
                    check = false;
                }

            }
            if(check){
                for(int k=0;k<P && k<N;k++){
                    B[k] += 1;
                }
            }
        }
        int sum = 0;
        for(int l=0;l<N;l++){
            sum += B[l];
        }
        System.out.println(sum);

    }
}
