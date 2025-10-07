import java.util.*;
class compare
{
    void grade(Scanner sc)
    {
         sc = new Scanner(System.in);
        System.out.print("marks=");
        int mark = sc.nextInt();
        if (mark >= 90) {
            System.out.println("Grade A");
        } else if (mark >= 80) {
            System.out.println("Grade B");
        } else if (mark >= 70) {
            System.out.println("Grade C");
        } else if (mark >= 60) {
            System.out.println("Grade D");
        } else if (mark >= 35) {
            System.out.println("Fail");
        } 
    }
}
public class Pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        compare cmp=new compare();
        cmp.grade(sc);
        sc.close();
    }
}