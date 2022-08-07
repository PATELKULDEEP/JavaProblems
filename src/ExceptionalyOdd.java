import java.util.HashMap;
import java.util.Map;

public class ExceptionalyOdd {

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,2,1,3};

        System.out.println(getOddOccurrence(arr,7));

    }
    static int getOddOccurrence(int[] arr, int n) {
        // code here

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++){

            if(hm.containsKey(arr[i])){
                int value = hm.get(arr[i]);
                value = value+1;
                hm.put(arr[i],value);
            }
            else{
                hm.put(arr[i],1);
            }

        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){

            if((entry.getValue() % 2) != 0){
                return entry.getKey();
            }

        }


        return 0;
    }

}
