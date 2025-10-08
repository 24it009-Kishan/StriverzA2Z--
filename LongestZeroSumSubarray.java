import java.util.*;

public class LongestZeroSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF ARRAY: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("ENTER ARRAY ELEMENTS:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = longestZeroSumSubarray(arr);
        System.out.println("LENGTH OF LONGEST ZERO-SUM SUBARRAY: " + result);

        sc.close();
    }

    public static int longestZeroSumSubarray(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>(); 
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLen = i + 1; 
            }

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}
