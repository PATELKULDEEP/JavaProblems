public class StringNumberIncrement {

    public static void main(String[] args) {
        String n = "123";
//        System.out.println(n.substring(0,3)+"0"+n.substring(4));
//        System.out.println(n.charAt(3));
//        System.out.println(n.charAt(2));
//        String re = String.valueOf((char) (n.charAt(1)+1));
int len = n.length();
int start = len;
//        n = n.substring(0,1)+ re+n.substring(2,4);
//        System.out.println(n);
        System.out.println(increase(n,start,len));
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
