import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReduceArraySizeToTheHalf {

    public static void main(String[] args) {
        int[] arr = {3,3,3,3,5,5,5,2,2,7};

        System.out.println(minSetSize(arr));

    }

    public static int minSetSize(int[] arr) {

        int size = arr.length;

        if(size == 0) return 0;
        HashMap<Integer,Integer> hm = new HashMap<>();

        int max = 0;

        for(int i=0;i<size;i++){

            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
                if(max == 0) max = 1;
            }

            else{
                int value = hm.get(arr[i]);
                hm.put(arr[i],value+1);

                if(value + 1 > max){
                    max = value +1;
                }

            }
        }

        if(max >= size/2) return 1;

        int[] answers = new int[hm.size()];
        int k =0;
        Iterator it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            answers[k] = hm.get(pair.getKey());
            k++;
            it.remove(); // avoids a ConcurrentModificationException
        }

        Arrays.sort(answers);
        int count = 0;
        int ans = 0;
        for(int i=0,j=answers.length;i<answers.length;i++){
            count += answers[i];
            if(count >= size/2) return ans+1;
            ans++;
        }
        return ans;

    }

}
