import java.util.Scanner;

public class XmasArrayRelevelExam {

    static int minElimination(int n, int arr[],int x){
        int count = 0;

        for(int i = 0;i<n-1;i++){
            while (arr[i] + arr[i+1] > x){
                count++;
                arr[i+1] = arr[i+1] - 1;
            }

        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int a[] = new int[n];

            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                }
            System.out.println(minElimination(n,a,x));

        }


        }
    }


