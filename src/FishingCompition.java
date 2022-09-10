import java.util.Scanner;

public class FishingCompition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String input = sc.nextLine();
        String str = "Sid:45:-1:0:0";
        String[] arr = str.split(":", 5);
        String name = arr[0];
        int age = Integer.parseInt(arr[1]);
        int big = Integer.parseInt(arr[2]);
        int medium = Integer.parseInt(arr[3]);
        int small = Integer.parseInt(arr[4]);

        if(age >= 18){
            int count = big+medium+small;
            if(count >= 0){
                int sum = (big*10)+(medium*6)+(small*3);
                System.out.println(arr[0]+" scored "+sum+" points");
            }
            else {
                System.out.println(count+" is an invalid input");
            }
        }
        else{
            System.out.println(age+" is an invalid age");
        }




    }
}
