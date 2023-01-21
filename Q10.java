import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-");
        int n = sc.nextInt();
        for (int i = 1 ; i<= n; i++)
        {
            int mul = i * i;
           if (mul <= n)
           {
               System.out.print(mul + " ");
           }
        }
    }
}
