import java.util.*;

public class MajorityElementNby3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF ARRAY: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("ENTER ARRAY ELEMENTS:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> result = majorityElement(nums);
        System.out.println("ELEMENTS APPEARING MORE THAN n/3 TIMES: " + result);

        sc.close();
    }

    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        return result;
    }
}
