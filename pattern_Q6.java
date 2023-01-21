import java.util.Scanner;

public class pattern_Q6 {
    public static void main(String[] args) {
        System.out.println("Enter a number :- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 1;
        int y = num/2;
        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j<=y;j++)
            {
                System.out.print("  ");
            }
            for (int k = 1 ; k <= x; k++)
            {
                System.out.print((char)(64+k) + " ");
            }
            System.out.println();
            if (i<=y)
            {
                x = x+ 2;
                y--;
            }
            else{
                x = x-2;
                y++;
            }
        }
    }
}
