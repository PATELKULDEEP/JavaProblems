import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MoreTheMerrier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] a = new int[n];
        int max = 0;
        int check = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();

        }

//        3 1 1 2 3


        for(int l=0;l<n;l++){


            HashMap<Integer,Integer> hm = new HashMap<>();
            

        }



//        for(int p=0;p<=n-m;p++){
//            HashSet<Integer> hs = new HashSet<>();
//            for(int q=p;q<p+m;q++){
//                hs.add(a[q]);
//            }
//            int size = hs.size();
//            if(size > max){
//                max = size;
//            }
//            if( m == max){
//                break;
//            }
//        }

        System.out.println(max);

    }

}
