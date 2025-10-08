import java.util.*;

public class LeadersInArray {
    public static int[] findLeaders(int[] nums, int n) {
        int[] leaders = new int[n];
        int index = 0;

        int maxfromright = nums[n - 1];
        leaders[index++] = maxfromright;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > maxfromright) {
                leaders[index++] = nums[i];
                maxfromright = nums[i];
            }
        }

        reverseArray(leaders, index);

        for (int i = index; i < n; i++) {
            leaders[i] = Integer.MIN_VALUE;
        }

        return leaders;
    }

    public static void reverseArray(int[] arr, int length) {
        int start = 0, end = length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF ELEMENTS: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("ENTER ELEMENTS:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] leaders = findLeaders(arr, n);

        System.out.println("LEADERS IN THE ARRAY:");
        for (int i = 0; i < leaders.length; i++) {
            if (leaders[i] != Integer.MIN_VALUE) { 
                System.out.print(leaders[i] + " ");
            }
        }

        sc.close();
    }
}
