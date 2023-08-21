import java.util.*;

public class Buy_and_Sell_Stock_2 {
        public int maxProfit(int[] prices) {
                int diff = 0;
                for (int i = 1; i < prices.length; i++) {
                        if (prices[i] > prices[i - 1]) {
                                diff += prices[i] - prices[i - 1];
                        }
                }
                return diff;
        }

        public static void main(String[] args) {
                Buy_and_Sell_Stock solution = new Buy_and_Sell_Stock();
                int Arr[] = { 1, 2, 3, 4 };
                solution.maxProfit(Arr);
        }
}
