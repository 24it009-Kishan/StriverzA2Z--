import java.util.*;
public class Sortt 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            if(a[i] != i + 1)
            {
                System.out.println("array is not sorted");
                return;
            }
        }
}
}