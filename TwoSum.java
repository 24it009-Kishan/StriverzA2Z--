import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // check every pair
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; 
                }
            }
        }
        return new int[]{}; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ELEMENTS: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("ENTER ELEMENTS:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("ENTER TARGET SUM: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        if (result.length == 0) {
            System.out.println(-1);
        } else {
            System.out.println("INDICES: " + result[0] + ", " + result[1]);
        }

        sc.close();
    }
}
