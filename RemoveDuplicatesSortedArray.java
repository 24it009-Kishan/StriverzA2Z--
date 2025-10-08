import java.util.*;

public class RemoveDuplicatesSortedArray {
    public static int RemoveDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int index = 1; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE OF ARRAY: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("ENTER " + n + " ELMEMENTS IN SORTED ORDER:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = RemoveDuplicates(arr);

        System.out.println("NUMBER OF UNIQUE ELEMENTS: " + x);
        System.out.print("ARRAY AFTER REMOVING DUPLICATES: ");
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
