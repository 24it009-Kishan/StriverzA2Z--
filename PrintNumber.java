import java.util.Scanner;

public class PrintNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int x = sc.nextInt();
        System.err.println(x);
        sc.close();
    }
}