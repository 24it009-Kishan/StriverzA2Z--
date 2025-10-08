import java.util.Scanner;

public class ConesOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0; 
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF ELEMENTS: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("ENTER " + size + " ELEMENTS (0 or 1 ONLY):");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMaxConsecutiveOnes(arr);
        System.out.println("MAXIMUM CONSECTUIVE 1S: " + result);

        sc.close();
    }
}
