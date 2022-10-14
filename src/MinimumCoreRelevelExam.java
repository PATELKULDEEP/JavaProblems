import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinimumCoreRelevelExam {

    static int minCore(long array[][], int n){
        ArrayList<pair> Time = new ArrayList<>();

        for(int i=0;i<n;i++){
            Time.add(new pair((int) array[i][0], 1));
            Time.add(new pair((int) array[i][1], -1));
        }

        Collections.sort(Time, (pair A, pair B) -> {
            return A.first - B.first;
        });

        int answer = 0, sum = 0;

        for(int i=0;i<Time.size();i++){
            sum += Time.get(i).second;
            answer = Math.max(answer,sum);
        }

        return answer;

    }

    static class pair {
        int first, second;
        pair(int x, int y){
            first = x;
            second = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[][] = new long[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                a[i][j] = sc.nextLong();
            }

        }
        System.out.println(minCore(a,n));















    }

}
