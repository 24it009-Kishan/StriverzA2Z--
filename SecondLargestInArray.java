import java.util.Scanner;

class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF ELEMENTS: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("ENTER ELEMENTS: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max= arr[0];
        int prev = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                prev = max;
                max = arr[i];
            }
            else if(arr[i]>prev && arr[i]!=max){
                prev = arr[i];
            }
        }
        System.out.println("SECOND LARGEST ELEMENT : "+ prev);

    }
};