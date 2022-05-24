import java.util.Scanner;

public class StockBuySell {

    static int arr[] = new int[6] ;
    static int LowBuy ;
    static int HighSell;
    static  int Difference = 0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 6 Day Stock Closing Price : ");
        for(int i = 0 ; i< 6; i++){
            arr[i] = input.nextInt();
        }

        for(int j = 0; j<5 ; j++){
            int diff;
            for(int k = j; k < 6 ; k++){

                diff = arr[k] - arr[j];
                if(Difference < diff)  Difference = diff;

            }

        }

        System.out.println(Difference);

//        LowBuy = arr[0];
//        HighSell = arr[5];
//        Buying Day


//        Selling Day

    }

}

//class Solution {
//    public int maxProfit(int[] prices) {
//
//        int Difference=0,diff=0 ;
//
//        for(int i = 0; i<(prices.length - 1);i++){
//            for(int j=i;j<prices.length;j++){
//                diff=prices[j]-prices[i];
//                if(Difference < diff){
//                    Difference = diff;
//                }
//            }
//        }
//
//        return Difference;
//
//
//    }
//}




//Low Time Complexcity
//
//class Solution {
//    public int maxProfit(int[] prices) {
//
//        int minArr[]= new int[prices.length];
//        int maxArr[]= new int[prices.length];
//        minArr[0]=prices[0];
//        for(int i=1;i<prices.length;i++)
//            minArr[i] = Math.min(minArr[i-1],prices[i]);
//
//
//        maxArr[prices.length - 1]=prices[prices.length - 1];
//        for(int i=prices.length-2;i>=0;i--)
//            maxArr[i] = Math.max(maxArr[i+1],prices[i]);
//
//
//        //min [7,1,1,1,1,1]
//        //max [7,6,6,6,6,4]
//        int max=0;
//        for(int i=0;i<prices.length;i++){
//            max = Math.max(max,maxArr[i]-minArr[i]);
//        }
//        return max;
//
//    }
//}