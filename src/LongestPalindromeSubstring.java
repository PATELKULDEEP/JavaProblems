public class LongestPalindromeSubstring {

    public static void main(String[] args) {

        String s = "cbbd";
        System.out.println("Answer = " + longestPalindrome(s));

    }

    public static String longestPalindrome(String s) {

        String newS2 = "";

        for(int j=0;j<s.length();j++) {
            String newS1 = "";


            for (int i = j+1; i<= s.length(); i++) {

                newS1 = s.substring(j,i);

                StringBuilder nS1 = new StringBuilder();

                // append a string into StringBuilder input1
                nS1.append(newS1);

                // reverse StringBuilder input1
                nS1.reverse();

                if (newS1.equals(nS1.toString())) {
                    if(newS1.length() > newS2.length()){
                        newS2 = newS1;
                    }
                }
            }

        }
        return newS2;

    }
}




