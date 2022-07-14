package DsaOne.Array;

public class StockBuyandSell {
    public static void main(String[] args) {
        int arr[] = { 5,2,6, 1, 4 };
        int minsofar = arr[0];
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            minsofar = Math.min(minsofar, arr[i]);
            int profit = arr[i] - minsofar;
            maxProfit = Math.max(maxProfit, profit);
        }
        System.out.println(maxProfit);

    }

}
