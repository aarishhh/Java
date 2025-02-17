//WAP To Check First Number Is Divisible By Second Number Or Not.
import java.util.Scanner;

public class Q31_Check_Divisibility {
    Scanner Check_Divisibility = new Scanner(System.in);
    float A, B;
    void Check_Divisibility_Input() {
        System.out.print("Enter The Value Of A: ");
        A = Check_Divisibility.nextFloat();
        System.out.print("Enter The Value Of B: ");
        B = Check_Divisibility.nextFloat();
    }
    void Check_Divisibility_Condition() {
        if (A % B == 0) {
            System.out.println(A+" Is Divisible By "+B);
        } else {
            System.out.println(A+" Is Not Divisible By "+B);
        }
    }
    public static void main(String[] args) {
        Q31_Check_Divisibility obj = new Q31_Check_Divisibility();
        obj.Check_Divisibility_Input();
        obj.Check_Divisibility_Condition();
    }
}
