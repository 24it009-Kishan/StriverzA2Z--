import java.util.Scanner;

public class Numberappears {
    public static int findmissingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; 
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF ELEMENTS: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("ENTER " + size + " INTEGERS(EVERY NUMBER APPEARS TWICE EXCEPT ONE):");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int snum = findmissingleNumber(arr);
        System.out.println("NUMBER THAT APPEARS ONCE: " + snum);

        sc.close();
    }
}
