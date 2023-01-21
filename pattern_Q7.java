import java.util.Scanner;

public class pattern_Q7 {
    public static void main(String[] args) {
        System.out.println("Enter a number :-");
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        for (int  i = 1; i<= num; i++)
        {
            for (int j = 1; j<= num; j++)
            {
                if (i==(num+1)/2 || j==(num+1)/2)
                {
                    System.out.print("*" + " ");
                }
                else
                {
                    System.out.print("  ");
                }

            }
            System.out.println(" ");
        }
    }
}
