import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DISTNUMSofCodeChef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++){

            int n = sc.nextInt();
            int k = sc.nextInt();

            int total = 0;

            HashSet<Integer> hs = new HashSet<>();

            hs.add(n);

            while (k>0){
                ArrayList<Integer> temp = new ArrayList<>();
                for(Integer m : hs){
                    temp.addAll(number(m));
                }
                hs.addAll(temp);
                k--;
            }
            for (Integer h : hs) {
                total += h;
            }
            System.out.println(total);

        }

    }

    static HashSet<Integer> number(int n){

        HashSet<Integer> hs = new HashSet<>();

        for(int j =1;j<=n;j++){
            if(n%j == 0){
                hs.add(j*n);
            }
        }

        return hs;
    }

}
