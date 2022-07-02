public class DeleteTwoStrings {

    public static void main(String[] args) {



        String word1 = "abcdxabcde";
        String word2 = "abcdeabcdx";

        System.out.println(minDistance(word1,word2));
    }
    public static int minDistance(String word1, String word2) {

        int count1 = 0;
        int answer1 = 0;
        String w1 = word1;
        String w2 = word2;
        int n1 = word1.length();
        int n2 = word2.length();
        for(int i=0;i<w1.length();i++){
            for(int j=0;j<w2.length();j++){
                if(w1.charAt(i) == w2.charAt(j)){
//                    word2 = word2.replace(word2.charAt(j),"");
//                    word2.deleteCharAt(j);
//                    System.out.println(word2.charAt(j));
                    w2 = w2.substring(j+1,w2.length());
                    count1++;
                }

            }
        }
        System.out.println(count1);
        count1 = count1 * 2;
        answer1 = (n1 + n2) -count1 ;
        System.out.println(answer1);

        int count2 = 0;
        int answer2 = 0;
        for(int i=word1.length()-1;i>=0;i--){
            for(int j=word2.length()-1;j>=0;j--){
                if(word1.charAt(i) == word2.charAt(j)){
//                    word2 = word2.replace(word2.charAt(j),"");
//                    word2.deleteCharAt(j);
//                    System.out.println(word2.charAt(j));
                    word2 = word2.substring(0,j);
                    count2++;
                    break;
                }

            }
        }
         System.out.println(count2);
        count2 = count2 * 2;
        answer2 = n1 + n2 -count2 ;
         System.out.println(answer2);
            if(answer1 < answer2 && answer1 != 0){
                return answer1;
            }
            return answer2;

    }

}
