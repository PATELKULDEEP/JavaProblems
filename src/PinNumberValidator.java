import java.util.Scanner;

public class PinNumberValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of PIN numbers");
        int a = sc.nextInt();

        if(a<1){
            System.out.println(a+" is an invalid number");
        }
        else{

            int b[] = new int[a];

            System.out.println("Enter the PIN numbers");
            for(int i=0;i<a;i++)
            {
                int value = sc.nextInt();
                int len = String.valueOf(value).length();
                if(len != 4){
                    System.out.println(value+" is an invalid PIN number");
                    System.exit(0);
                }
                int num = value;
                for(int j=0,k=4;j<4;j++,k--){
                    int n = num%10;
                    if(k == 4){
                        if(n == 4 || n == 6|| n== 8|| n == 9){}

                        else {
                            break;
                        }
                    }
                   else if(k == 3)
                    {
                        if(n == 2 || n == 3  || n == 5 || n == 7){

                        }
                        else {
                            break;
                        }
                    }
                   else if(k == 2){
                        if(n%2 != 0){
                            break;
                        }
                    }
                    if(k == 1){
                        if(n%2 != 0){
                            b[i] = value;
                        }
                    }
                    num = num/10;
                }
            }

            System.out.println("Valid PIN numbers are");
            for(int l=0;l<a;l++){
                if(b[l] != 0){
                    System.out.println(b[l]);
                }
                if(b[0] == 0 ){
                    System.out.println("all these "+a+"pin number");
                    System.exit(0);
                }

            }


        }
    }


}
