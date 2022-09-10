import java.util.Arrays;

public class TheWeekCharacter {

    public static void main(String[] args) {

        int[][] properties = {{1,5},{10,4},{4,3}};

        System.out.println(TheWeekCharacterGame(properties));

    }

    public static int TheWeekCharacterGame(int[][] properties){

        int count = 0;
        int len = properties.length;

        Arrays.sort(properties, (a, b) -> Integer.compare(b[0],a[0]));

        for(int i=0;i<len-1;i++)
        {

                if(properties[i][0] > properties[i+1][0] && properties[i][1] > properties[i+1][1])
                {
                    count++;
                }
          else if(properties[i][0] < properties[i+1][0] && properties[i][1] < properties[i+1][1])
            {
                count++;
            }

        }

        return count;
    }

}
