import java.util.Scanner;

public class Q00_OverLoading {
    float Num1, Num2;
    void Input() {
        Scanner Calculation = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        System.out.print("Enter 1st Number: ");
        Num1 = Calculation.nextFloat();
        System.out.print("Enter 2nd Number: ");
        Num2 = Calculation.nextFloat(); 
        Calculation.close();
    }
    float Addition(float num1, float num2) {
        float Result = Num1 + Num2;
        return Result;
    }

    float Multiplication(float num1, float num2) {
        float Result = Num1 * Num2;
        return Result;
    }

    public static void main(String[] args) {
        Q00_OverLoading Obj = new Q00_OverLoading();
        Obj.Input();
        System.out.printf("Addition = %.2f\n", Obj.Addition(0, 0));
        System.out.printf("Multiplication = %.2f", Obj.Multiplication(0, 0));
    }
}
