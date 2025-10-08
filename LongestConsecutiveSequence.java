import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ELEMENTS: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("ENTER ELEMENTS:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int length = longestConsecutive(nums);
        System.out.println("LENGTH OF LONGEST CONSECUTIVE SEQUENCE: " + length);

        sc.close();
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
