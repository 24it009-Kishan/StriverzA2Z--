import java.util.*;

class Solution {
    public void maxNum(Scanner sc) {
        System.out.print("nums = ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("The largest element in array is " + max);
    }
}

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        s.maxNum(sc);
        sc.close();
    }
}
