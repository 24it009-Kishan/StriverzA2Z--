import java.util.Scanner;
public class UnionOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ELEMENTS IN THE FIRST ARRAY:");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("ENTER ELEMENTS OF THE FIRST ARRAY:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("ENTER NUMBER OF ELEMENTS IN THE SECOND ARRAY:");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("ENTER ELEMENTS OF THE SECOND ARRAY:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] union = new int[n1 + n2];
        int index = 0;
        for (int i = 0; i < n1; i++) {
            union[index++] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            boolean found = false;
            for (int j = 0; j < n1; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                union[index++] = arr2[i];
            }
        }
        System.out.println("UNION OF THE TWO ARRAYS:");
        for (int i = 0; i < index; i++) {
            System.out.print(union[i]+" ");
        }
        
        sc.close();
    }
}
