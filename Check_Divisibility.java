import java.util.Scanner;

public class Check_Divisibility {
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
            System.out.println("A Is Divisible By B");
        } else {
            System.out.println("A Is Not Divisible By B");
        }
    }
    public static void main(String[] args) {
        Check_Divisibility obj = new Check_Divisibility();
        obj.Check_Divisibility_Input();
        obj.Check_Divisibility_Condition();
    }
}
