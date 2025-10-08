import java.util.*;

public class RearrangePosNeg {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];

        int pindex = 0; 
        int nindex = 0; 

       
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                pos[pindex] = nums[i];
                pindex++;
            } else {
                neg[nindex] = nums[i];
                nindex++;
            }
        }

        
        int[] result = new int[n];
        int k = 0;
        for (int i = 0; i < n / 2; i++) {
            result[k++] = pos[i]; 
            result[k++] = neg[i]; 
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER OF ELEMENTS (must be even): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("ENTER ELEMENTS(equal positive and negative):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = rearrangeArray(arr);

        System.out.println("REARRANGED ARRAY:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
