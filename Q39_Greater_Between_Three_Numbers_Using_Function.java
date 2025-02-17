
//WAP To Find Greater Between Given 3 Numbers.
import java.util.Scanner;

public class Q39_Greater_Between_Three_Numbers_Using_Function {
    Scanner Greater_Between_Three_Numbers_Using_Function = new Scanner(System.in);
    int Num1, Num2, Num3;

    void Input() {
        System.out.print("Enter Three Numbers: ");
        Num1 = Greater_Between_Three_Numbers_Using_Function.nextInt();
        Num2 = Greater_Between_Three_Numbers_Using_Function.nextInt();
        Num3 = Greater_Between_Three_Numbers_Using_Function.nextInt();
    }

    void Output() {
        if (Num1 > Num2 && Num1 > Num3) {
            System.out.println(Num1 + " Is Greater.");
        } else if (Num2 > Num1 && Num2 > Num3) {
            System.out.println(Num2 + " Is Greater.");
        } else {
            System.out.println(Num3 + " Is Greater.");
        }
    }

    public static void main(String[] args) {
        Q39_Greater_Between_Three_Numbers_Using_Function obj = new Q39_Greater_Between_Three_Numbers_Using_Function();
        obj.Input();
        obj.Output();
    }
}