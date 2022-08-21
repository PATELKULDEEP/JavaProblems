public class MinimumReplaceOfCharacter {

    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBBWWWWBBWWBBBBWWBBWWBBBWWBBBWWWBWBWW",15));
    }
    public static int minimumRecolors(String blocks, int k) {

        int count = 1, max = blocks.length();

        for(int l=1;l<blocks.length();l++){
            if(blocks.substring(l-1,l).equals("B") && blocks.substring(l,l+1).equals("B")){
                count++;
            }
            else count=0;
            if(count == k){
                return 0;
            }
        }



        for(int i=0;i<blocks.length()-k+1;i++){
            count = 0;
            if(blocks.substring(i,i+1).equals("B")){
                for(int j=i;j<blocks.length() && j<i+k ;j++){
                    if(blocks.substring(j,j+1).equals("B")){
                        count++;
                    }
                }

                if(count < max){
                    max =  k-count;
                }
            }

        }

        return max;

    }

}
