package algorithm.array;

public class BestTimeToBuy {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];

        for (int price : prices) {
            min = Math.min(price, min);
            max = Math.max(max, price - min);
        }

        return max;
    }

    public static void main(String[] args) {
        BestTimeToBuy bestTimeToBuy = new BestTimeToBuy();
        System.out.println(bestTimeToBuy.maxProfit(new int[]{8, 1, 5, 3, 6, 4}));
    }
}
