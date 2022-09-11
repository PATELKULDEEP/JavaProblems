import jdk.jfr.Unsigned;

import java.util.Scanner;

public class NumberOfTrailingZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] arr = s.split(" ",2);
        String a = arr[0];
        String b = arr[1];
        int size =a.length();
         a = increase(a,size,size);
        int count = 0;
        boolean check = true;

        while(check ){

            int num = 1;
            int len = a.length();

            for(int i = 0;i< len;i++){
                int value = Character.getNumericValue(a.charAt(i));
                if(value == 0){
                    num = 0;
                    break;
                }
                else {
                    num = num*value;
                }

            }
            if(num == 0){
                count++;
            }
            else {
                while (num > 0){
                    int n = num%10;
                    if(n == 0){
                        count++;
                    }
                    else {

                        break;
                    }
                    num = num/10;
                }
            }

            if(a.equals(b)){
                check=false;
            }
            a= increase(a,len,len);
        }
        System.out.println(count);

    }
    public static String increase (String s,int n,int k){
        while (n>0){
            if(s.charAt(n-1) == '9'){
                s = s.substring(0,n-1)+ "0"+s.substring(n,k);
                if(n == 1){
                    s = "1"+s;
                    break;
                }
                n--;
                increase(s,n,k);
            }
            else {
                String re = String.valueOf((char) (s.charAt(n-1)+1));

                s = s.substring(0,n-1)+ re+s.substring(n,k);
                break;
            }
        }
        return s;
    }

}
