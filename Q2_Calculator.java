//Write A Program To Add, Subtract, Multiply And Divide Two Integer Numbers. Take Input From User.
import java.util.Scanner;

public class Q2_Calculator {
    public static void main(String[] args) {
        Scanner Calculator = new Scanner(System.in);
        System.out.println("Enter Two Numbers To Get Addition, Subtraction, Multiplication, Division: ");
        System.out.print("Enter The First Number: ");
        float num1 = Calculator.nextFloat();
        System.out.print("Enter The Second Number: ");
        float num2 = Calculator.nextFloat();
        System.out.println("\nAddition Is: "+(num1+num2));
        System.out.println("\nSubtraction Is: "+(num1-num2));
        System.out.println("\nMultiplication Is: "+(num1*num2));
        System.out.println("\nDivision Is: "+(num1/num2));
        Calculator.close();
    }
}