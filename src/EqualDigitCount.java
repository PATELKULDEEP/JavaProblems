import java.util.Arrays;
import java.util.Scanner;

public class EqualDigitCount {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String n = input.next();

        System.out.println(checkDigitValue(n));


    }
    static boolean checkDigitValue(String num){

//        int[] arr = new int[num.length()];
//        for(int i=0;i<num.length();i++){
//            int a=Character.getNumericValue(num.charAt(i));
//            arr[i] = a;
//        }
//        for(int i = 0; i< arr.length ;i++){
//            int count = 0;
//            for(int j = 0; j < arr.length;j++ ){
//                if(arr[j] == i){
//                    count++;
//                }
//            }
//            if(count != arr[i]){
//                return false;
//            }
//        }
//        return true;


//        Abhishek Style
                int[] arr = new int[num.length()];
        for(int i=0;i<num.length();i++){
            int a=Character.getNumericValue(num.charAt(i));
            arr[i] = a;
        }
        int[] count = new int[11];

        for(int i=0;i< arr.length;i++){

            count[arr[i]]++;
//030
//            100
//            1001
//            2001


        }
        for(int j=0;j<arr.length;j++){
            if(count[j] != arr[j]){
                return false;
            }
        }

        return true;
    }

}
