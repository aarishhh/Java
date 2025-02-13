import java.util.Scanner;

public class Simple_Interest_Using_Function {
    Scanner Simple_Interest_Using_Function = new Scanner(System.in);
    float Principal_Amt, Rate_Of_Interest, Time_Period, Simple_Interest, Final_Amount;
    void Simple_Interest_Input(){
        System.out.println("Enter Principal Amount: ");
        Principal_Amt = Simple_Interest_Using_Function.nextFloat();
        System.out.println("Enter Rate Of Interest: ");
        Rate_Of_Interest = Simple_Interest_Using_Function.nextFloat();
        System.out.println("Enter Time Period: ");
        Time_Period = Simple_Interest_Using_Function.nextFloat();
    }
    void Simple_Interest_Final_Amount_Calculation(){
        Simple_Interest = (Principal_Amt * Rate_Of_Interest * Time_Period) / 100;
        Final_Amount = Principal_Amt + Simple_Interest;
    }
    void Output() {
        System.out.println("Simple Interest: " + Simple_Interest);
        System.out.println("Final Amount: " + Final_Amount);
    }
    public static void main(String[] args) {
        Simple_Interest_Using_Function obj = new Simple_Interest_Using_Function();
        obj.Simple_Interest_Input();
        obj.Simple_Interest_Final_Amount_Calculation();
        obj.Output();
    }
}
