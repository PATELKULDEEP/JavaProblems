import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CheckBinaryCodeOfSizeK {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Binary String : ");
        String s = input.next();
        System.out.print("Enter k value : ");
        int k = input.nextInt();

        System.out.print(hasAllCodes(s,k));

    }
    static boolean hasAllCodes(String s, int k) {


        int count = (int)Math.pow(2,k);

        HashSet<String> hs = new HashSet<>();
        for (int i = k,c=0; i < s.length(); i++,c++) {


        String ns = s.substring(c, i);

        if (!hs.contains(ns)) {
            hs.add(ns);
            count--;
            if(count == 0){
                return true;
            }
        }
    }

        return false;

    }

}
