import java.util.Scanner;

public class prime_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i =2; i<= num;i++)
        {
           if (i % 2 != 0 || i== 2)
           {
               System.out.println(i);
           }
        }
    }
}
