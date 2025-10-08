import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ELEMENTS: ");
        int n = sc.nextInt();           
        int[] arr = new int[n];       
        System.out.println("ENTER ELEMENTS: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();     
        }
        System.out.println("ENTER ELEMENT TO BE SEARCHED: ");
        int target = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println("ELEMENT FOUND AT INDEX : " + i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(-1);
        }
        sc.close();
    }
}   
