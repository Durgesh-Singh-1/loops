import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print factorial :-");
        int factorial = sc.nextInt();
        int ans= 1;
        for (int i = 1 ; i <=factorial; i ++)
        {
         ans *= i;
        }
        System.out.println("Factorial of " + factorial + " = " + ans );
    }
}
