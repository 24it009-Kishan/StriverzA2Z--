import java.util.*;

public class MajorityElement {
    public static int FindMajorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF ELEMENTS:  ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("ENTER ELEMENTS:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int majority = FindMajorityElement(nums);
        System.out.println("MAJORITY ELEMENT: " + majority);

        sc.close();
    }
}
