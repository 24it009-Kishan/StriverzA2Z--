import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a); 

        int max = a[n - 1];
        int second = -1;

        for(int i = n - 2; i >= 0; i--) {
            if(a[i] < max) {
                second = a[i];
                break;
            }
        }

        System.out.println(second);
    }
}