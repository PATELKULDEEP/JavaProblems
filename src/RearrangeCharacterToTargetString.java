import java.util.Arrays;

public class RearrangeCharacterToTargetString {

    public static void main(String[] args){

        String s = "abbaccaddaeea";
        String target = "aaaaa";

        System.out.println(rearrngeCharacter(s,target));


    }

    static int rearrngeCharacter(String s, String target){

        int minCount = 0;

        int[] count = new int[target.length()];

        String[] newTarget = new String[target.length()];
        String[] newS = new String[s.length()];

        for(int i=0;i<target.length();i++){
            Character n = target.charAt(i);
            if(i==0){
                newTarget[0] = String.valueOf(n);
            }
            for(int j=0;j<target.length();j++){
                if (!newTarget[j].equals(String.valueOf(n))) {
                    newTarget[i] = String.valueOf(n);
                    break;
                }

            }
        }
        for(int i=0;i<s.length();i++){
            Character n = s.charAt(i);
            newS[i] = String.valueOf(n);
        }
        System.out.println(Arrays.toString(newTarget));
        System.out.println(Arrays.toString(newS));


        for(int i=0;i<newS.length;i++){
            for(int j=0;j<newTarget.length;j++){

                if(newS[i].equals(newTarget[j])){
                    System.out.println(newTarget[j]);
                    count[j]++;
                }

            }
        }

        minCount = count[0];

        System.out.println(Arrays.toString(count));
        for(int i=0;i<count.length;i++){

            if(count[i] < minCount){
                minCount = count[i];
            }
        }
//        int minCount = 0;
//
//        String[] newTarget = new String[target.length()];
//        String[] newS = new String[s.length()];
//        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
//
//        int[] count = new int[11];
//
//
//
//        for(int i=0;i<target.length();i++){
//            Character n = target.charAt(i);
//            newTarget[i] = String.valueOf(n);
//        }
//        for(int i=0;i<s.length();i++){
//            Character n = s.charAt(i);
//            newS[i] = String.valueOf(n);
//        }
//        System.out.println(Arrays.toString(newTarget));
//        System.out.println(Arrays.toString(newS));
//
//        for(int j=0; j<newTarget.length;j++){
//            if(newTarget[j] == alphabet[j]){
//                alphabet[j]++;
//            }
//        }
//
        return minCount;
    }

}
