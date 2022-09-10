public class BuySellStockIV {

    public static void main(String[] args) {
        int[] prices = {3,2,6,5,0,3};
        System.out.println(maxProfit(2,prices));

    }
    public static int maxProfit(int k, int[] prices){
        int profit = 0;
        int max = 0;

        int len = prices.length;

        for(int i=0;i<len-1;i++){

            for(int j=i+1;j<len;j++){
                int value = prices[j]-prices[i];
                if(value>max){
                    max = value;
                }
            }
        }
        profit = max;

        return profit;
    }

}

