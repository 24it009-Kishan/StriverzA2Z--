import java.util.Scanner;

public class LeftRotateByd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF ELEMENTS AND NUMBER OF ROTATIONS: ");
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("ENTER ELEMENTS: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<d;j++){
        int x = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = x;
        }
        System.out.println("ARRAY AFTER LEFT ROTATION: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}