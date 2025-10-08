import java.util.Scanner;

public class LongestSubarrayPositive {
    public static int longestSubarraySumK(int[] arr, int k) {
        int start = 0, sum = 0, maxLen = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];   
            while (sum > k && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == k) {
                int len = end - start + 1;
                if (len > maxLen) {
                    maxLen = len;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF ARRAY: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("ENTER ARRAY ELEMENTS (POSITIVE NUMBERS): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("ENTER VALUE OF K: ");
        int k = sc.nextInt();

        int result = longestSubarraySumK(arr, k);
        System.out.println("LENGTH OF LONGEST SUBARRAY WITH SUM " + k + " = " + result);

        sc.close();
    }
}
