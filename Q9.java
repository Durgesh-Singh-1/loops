import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a prime Number :-");
        int prime = sc.nextInt();
        if (prime % 2 != 0 || prime == 2)
        {
            if (prime / 10 >0)
            {
                System.out.println("true");
            }
            else
                System.out.println("false");
        }
        else
            System.out.println("Invalid Input");
    }
}
