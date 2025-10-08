import java.util.*;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF ARRAY: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("ENTER ARRAY ELEMENTS:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("ENTER k: ");
        int k = sc.nextInt();

        System.out.println("TOTAL SUBARRAYS WITH SUM = " + k + " → " + subarraySum(nums, k));
        sc.close();
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); 

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;

            if (prefixSumCount.containsKey(sum - k)) {
                count += prefixSumCount.get(sum - k);
            }

            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
