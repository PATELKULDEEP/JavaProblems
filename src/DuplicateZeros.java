import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args){

        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);

    }

    public static void duplicateZeros(int[] arr) {
        int[] newArr = new int[arr.length];
        int count = 0;
        for(int i=0;count<arr.length;i++){

                if(arr[i] == 0){
                    newArr[count] = 0;
                    count++;
                        if(count == arr.length)
                            break;
                    newArr[count] = 0;
                    count++;
                }
                else{
                    newArr[count] = arr[i];
                    count++;
                }
        }
        for(int j=0;j<arr.length;j++){
            arr[j] = newArr[j];
        }
        System.out.println(Arrays.toString(arr));
    }

}
