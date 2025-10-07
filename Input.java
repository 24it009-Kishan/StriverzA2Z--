import java.util.Scanner;

class Input {
    public void printNumber(Scanner sc) {
        float a = sc.nextFloat();       
        int b = (int) a;               
        System.out.println(b);         
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input sol = new Input();
        sol.printNumber(sc);
    }
}
