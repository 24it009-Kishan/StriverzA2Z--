import java.util.*;

class solution
{
    public void week(Scanner sc)
    {
        System.out.print("day=");
        int day=sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
    }  
}
class Switch
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        solution obj=new solution();
        obj.week(sc);
        sc.close();
    }
}
