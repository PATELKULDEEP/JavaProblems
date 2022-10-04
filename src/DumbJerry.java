import java.util.Scanner;

public class DumbJerry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        int[] x = new int[n];
        int p = 0, q = n-1,l=0;
        while( p != q){
            if(a[p] > a[q]){
                x[l] = a[p];
                p++;
            }
            else{
                x[l] = a[q];
                q--;
            }

            l++;
        }
        x[l] = a[p];

        for(int m=0;m<n;m++){
            System.out.print(x[m]+" ");
        }

    }

}
