import java.util.Scanner;

public class MinionArmy {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        int count = 0;
        for(int j=1;j<=n;j++){
            for(int k=0;k<n;k++){
                if(arr[k] == j){
                    System.out.println(j);
                    count++;
                    break;
                }
            }
        }
        System.out.println(n-count);
    }
}
