import java.util.*;

public class Buy_and_Sell_Stock {
        public int maxProfit(int[] prices) {
                int maxp = 0;
                int minElem = prices[0];
                for (int i = 0; i < prices.length; i++) {
                        minElem = Math.min(minElem, prices[i]);
                        int profit = prices[i] - minElem;
                        maxp = Math.max(maxp, profit);

                }
                System.out.println(maxp);
                return maxp;
        }

        public static void main(String[] args) {
                Buy_and_Sell_Stock solution = new Buy_and_Sell_Stock();
                int Arr[] = { 1, 2, 3, 43, 21, 1 };
                solution.maxProfit(Arr);
        }
}
