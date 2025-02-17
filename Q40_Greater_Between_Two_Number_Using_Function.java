
//WAP To Find Greater Between Given 2 Numbers Using ?: Operator.
import java.util.Scanner;

public class Q40_Greater_Between_Two_Number_Using_Function {
    Scanner Greater_Between_Two = new Scanner(System.in);
    int Num1, Num2;

    void Input() {
        System.out.print("Enter Two Numbers: ");
        Num1 = Greater_Between_Two.nextInt();
        Num2 = Greater_Between_Two.nextInt();
    }

    void Check() {
        int Result = (Num1 > Num2) ? Num1 : Num2;
        System.out.println("Greater number is: " + Result);
    }

    public static void main(String[] args) {
        Q40_Greater_Between_Two_Number_Using_Function obj = new Q40_Greater_Between_Two_Number_Using_Function();
        obj.Input();
        obj.Check();
    }
}