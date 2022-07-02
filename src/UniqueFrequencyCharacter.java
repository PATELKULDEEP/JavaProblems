import java.util.HashSet;

public class UniqueFrequencyCharacter {

    public static void main(String[] args) {

        String s = "abb";

        System.out.println(minDeletions(s));
    }
    public static int minDeletions(String s) {

        HashSet<String> newString = new HashSet<>();

        for(int i=0;i<s.length();i++){
            newString.add(Character.toString(s.charAt(i)));
            System.out.println(newString);
        }
        System.out.println(newString);

        return 0;

    }

}
