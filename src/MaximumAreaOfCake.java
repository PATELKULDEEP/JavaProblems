import java.util.Arrays;

public class MaximumAreaOfCake {

    public static void main(String[] args) {
        int h = 5;
        int w = 4;
        int[] horizontalCut =  {3,1};
        int [] verticalCut = {1};

        System.out.println(maxArea(h,w,horizontalCut,verticalCut));
    }

    public static int maxArea(int h, int w, int[] horizontalCut, int[] verticalCut){

        int maxH = 0;
        int maxV = 0;

        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);

        for(int i=0;i< horizontalCut.length;i++){
            maxH = Math.max(maxH, i==0 ? horizontalCut[i] : horizontalCut[i] - horizontalCut[i - 1]);
        }
        maxH = Math.max(maxH, h - horizontalCut[horizontalCut.length - 1]);
        for (int i = 0; i < verticalCut.length; i++) {
            maxV = Math.max(maxV, i == 0 ? verticalCut[i] : verticalCut[i] - verticalCut[i - 1]);
        }
        maxV = Math.max(maxV, w - verticalCut[verticalCut.length - 1]);
        return (int)((long)maxH * maxV % (int)(1e9 + 7));

    }

}
