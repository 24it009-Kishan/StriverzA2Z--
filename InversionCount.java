import java.util.*;

public class InversionCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF ARRAY: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("ENTER " + n + " ELEMENTS:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        long inversions = countInversions(nums);
        System.out.println("NUMBER OF INVERSIONS: " + inversions);
        sc.close();
    }

    public static long countInversions(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private static long mergeSort(int[] arr, int left, int right) {
        long count = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += merge(arr, left, mid, right);
        }
        return count;
    }

    private static long merge(int[] arr, int left, int mid, int right) {
        int[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;
        long count = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                count += (leftArr.length - i);
            }
        }

        while (i < leftArr.length) arr[k++] = leftArr[i++];
        while (j < rightArr.length) arr[k++] = rightArr[j++];

        return count;
    }
}
