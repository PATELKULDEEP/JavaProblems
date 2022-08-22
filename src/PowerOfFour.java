public class PowerOfFour {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(1));
    }
    public static boolean isPowerOfFour(int n) {
        for(int i=0;i<=n;i++){
            if(n == (Math.pow(4,i))){
                return true;
            }
            if(n < (Math.pow(4,i))){
                break;
            }
        }
        return false;
    }

}
