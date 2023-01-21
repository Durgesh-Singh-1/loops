import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to print fibonacci :- ");
        int fib = sc.nextInt();
        int num1 = 0 , num2 = 1 , ans ;
        System.out.print(num2 + " ");
        for (int i = 2; i<=fib; i++)
        {
            ans = num1 + num2;
            System.out.print(ans + " ");
            num1 = num2;
            num2 = ans;
        }

    }
}
