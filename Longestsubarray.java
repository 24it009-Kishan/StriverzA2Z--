import java.util.*;

public class Longestsubarray{
    public static int longestSubarrayWithSumK(int[] nums, int k) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (prefixSumMap.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - prefixSumMap.get(sum - k));
            }
            if (!prefixSumMap.containsKey(sum)) {
                prefixSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int length = longestSubarrayWithSumK(arr, k);
        System.out.println("Length of longest subarray with sum " + k + ": " + length);

        sc.close();
    }
}
