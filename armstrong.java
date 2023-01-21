import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to you want to prints Armstrong Number :- ");
        int num = sc.nextInt();
        int sum = 0 ;
        int copy;
        int rem;
        for (int i = 1 ; i<= num ; i++)
        {
            copy = i;
            while (copy > 0)
            {
               rem = copy % 10 ;
               copy = copy / 10;
               sum = sum + (rem * rem * rem);
            }
            if (sum == i)
            {
                System.out.println(sum);
            }
            sum = 0 ;
        }
    }
}
