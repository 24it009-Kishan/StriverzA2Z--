import java.util.*;

public class SubarraysWithXOR {
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

        int result = countSubarraysWithXOR(nums, k);
        System.out.println("TOTAL SUBARRAYS WITH XOR = " + k + ": " + result);

        sc.close();
    }

    public static int countSubarraysWithXOR(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>(); 
        int count = 0, prefixXor = 0;

        for (int num : nums) {
            prefixXor ^= num; 
            if (prefixXor == k) {
                count++; 
            }
            int required = prefixXor ^ k;
            count += freq.getOrDefault(required, 0);

           
            freq.put(prefixXor, freq.getOrDefault(prefixXor, 0) + 1);
        }

        return count;
    }
}
