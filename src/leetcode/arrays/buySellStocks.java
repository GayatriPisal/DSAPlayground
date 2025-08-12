package leetcode.arrays;


public class buySellStocks {

    public static void main(String args[]) {

        //Time complexity : O(n)
        //Space complexity : O(1)
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Profit : "+ maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {

        int profit = 0;
        int buy = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++)
        {
            if(prices[i] < buy)
                buy = prices[i];
            else if(prices[i] - buy > profit)
                profit = prices[i] - buy;
        }

        return profit;
    }
}
