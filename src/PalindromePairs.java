import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromePairs {
    public static void main(String[] args) {
            String[] words = {"abcd","dcba","lls","s","sssll"};
            System.out.println(palindromePairs(words));
    }
    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> pairs = new ArrayList<>();
        int len = words.length;

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i == j){
                    continue;
                }
                List<Integer> w = new ArrayList<Integer>();

//                for(int i=1;i<10; i++){
//                    w.add(i);
//                    a.add(new ArrayList(w));
//                }
                String check = words[i]+words[j];

                String revString = "";

                int size = check.length();

//                String str2rvs = new StringBuilder(str2).reverse().toString();

//                for(int l=size-1;l>=0;l--){
//
//                    revString = revString + check.charAt(l);
//
//                }

                if(revString.equals(check)){
                    w.add(i);
                    w.add(j);
                    pairs.add(new ArrayList(w));
                }

            }
        }

        return pairs;
    }


}
