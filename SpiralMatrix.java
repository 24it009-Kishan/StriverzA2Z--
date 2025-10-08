import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER ROWS (M): ");
        int m = sc.nextInt();
        System.out.print("ENTER COLUMNS (N): ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("ENTER MATRIX ELEMENTS:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("SPIRAL ORDER:");
        spiralOrder(matrix, m, n);

        sc.close();
    }

    public static void spiralOrder(int[][] matrix, int m, int n) {
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Traverse left → right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Traverse top → bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Traverse right → left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Traverse bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
