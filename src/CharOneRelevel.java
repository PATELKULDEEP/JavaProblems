/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CharOneRelevel
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        // 0100, 1100, 1110, 1111, 0110, 0111,0101

        Scanner input = new Scanner(System.in);

        String S = input.nextLine();

        HashSet<String> hs = new HashSet<>();

//        0100,

        for(int i=0;i<S.length();i++){
            String newS = S;
            for(int j=i;j<S.length();j++){
                if(S.substring(j,j+1).equals("1")){
                    continue;
                }
                else {
                 newS = newS.substring(0,j)+"1"+newS.substring(j+1,S.length());
                }
                System.out.println(newS);
                hs.add(newS);
            }

        }

        System.out.println(hs.size());

    }
}
