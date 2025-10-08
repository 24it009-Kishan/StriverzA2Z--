import java.util.Scanner;

public class Marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER MARKS: ");
        int marks = sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("GRADE A");
        }
        else if(marks>=70 && marks<90){
            System.out.println("GRADE B");
        }
        else if(marks>=50 && marks<70){
            System.out.println("GRADE C");
        }
        else if(marks>=35 && marks<50){
            System.out.println("GRADED");
        }
        else{
            System.out.println("FAIL");
        }
        sc.close();
    }
}