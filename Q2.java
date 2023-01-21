import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int  sum =0;
        System.out.println("Enter a number you want to input number :-");
        int num1 = sc.nextInt();
        int neg_Ans = 0;
        int pos_ans =0;
        for (int i = 1 ;i <= num1; i ++ )
        {
            int num2 = sc.nextInt();
            if ( num2 < 0)
            {
               neg_Ans += num2;
            }
            else {
                pos_ans += num2;
            }
        }
         if (neg_Ans < 0)
         {
             System.out.println("-1");
         }
         else
         {
             System.out.println(pos_ans );
         }
    }
}