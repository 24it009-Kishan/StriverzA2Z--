import java.util.*;

public class MaxStockProfit {
    public static int maxProfit(int[] arr) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int price : arr) {
            if (price < minprice) {
                minprice = price; 
            } else if (price - minprice > maxprofit) {
                maxprofit = price - minprice; 
            }
        }

        return maxprofit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER OF DAYS: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("ENTER STOCK PRICES:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxProfit = maxProfit(arr);
        System.out.println("MAXIMUM PROFIT: " + maxProfit);

        sc.close();
    }
}
