import java.util.*;

public class LongestSubarraySumKposandneg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF ARRAY: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("ENTER " + n + " ELEMENTS (CAN BE POSITIVE OR NEGATIVE):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("ENTER VALUE OF K: ");
        int k = sc.nextInt();

        int result = longestSubarray(nums, k);
        System.out.println("LENGTH OF LONGEST SUBARRAY WITH SUM " + k + " IS: " + result);

        sc.close();
    }

    public static int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 0;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += nums[end];
                if (sum == k) {
                    maxLen = Math.max(maxLen, end - start + 1);
                }
            }
        }

        return maxLen;
    }
}
