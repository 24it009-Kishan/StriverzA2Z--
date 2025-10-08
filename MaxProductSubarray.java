import java.util.*;

public class MaxProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF ARRAY: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("ENTER " + n + " ELEMENTS:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxProduct(nums);
        System.out.println("MAXIMUM PRODUCT SUBARRAY: " + result);

        sc.close();
    }

    public static int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);

            result = Math.max(result, maxProd);
        }

        return result;
    }
}
