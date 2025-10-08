import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("ENTER M (NUMBER OF VALID ELEMENTS IN NUMS1): ");
        int m = sc.nextInt();

        System.out.print("ENTER N (SIZE OF NUMS2): ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];
        System.out.println("ENTER " + m + " ELEMENTS OF NUMS1 (SORTED):");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        int[] nums2 = new int[n];
        System.out.println("ENTER " + n + " ELEMENTS OF NUMS2 (SORTED):");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println("MERGED ARRAY:");
        System.out.println(Arrays.toString(nums1));

        sc.close();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; 
        int j = n - 1; 
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
