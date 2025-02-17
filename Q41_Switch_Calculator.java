
//Built A Arithmetic Calculator Using Switch And Class Concept.
import java.util.Scanner;

public class Q41_Switch_Calculator {
    Scanner Calculator = new Scanner(System.in);
    int Number1, Number2, Result;

    void Input() {
        System.out.print("Enter 1st Number: ");
        Number1 = Calculator.nextInt();
        System.out.print("Enter 2nd Number: ");
        Number2 = Calculator.nextInt();
    }

    void Add() {
        Result = Number1 + Number2;
        System.out.println("Addition Of " + (Number1) + " And " + (Number2) + " Is: " + Result);
    }

    void Subtract() {
        Result = Number1 - Number2;
        System.out.println("Subtraction Of " + (Number1) + " And " + (Number2) + " Is: " + Result);
    }

    void Multiply() {
        Result = Number1 * Number2;
        System.out.println("Multiplication Of " + (Number1) + " And " + (Number2) + " Is: " + Result);
    }

    void Divide() {
        Result = Number1 / Number2;
        System.out.println("Division Of " + (Number1) + " And " + (Number2) + " Is: " + Result);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n");
            Q41_Switch_Calculator Calculate = new Q41_Switch_Calculator();
            System.out.print(
                    "Enter + For Addition\nEnter - For Subtraction\nEnter * For Multiplication\nEnter / For Division\nEnter Your Choice: ");
            char Choice = Calculate.Calculator.nextLine().charAt(0);

            switch (Choice) {
                case '+':
                    Calculate.Input();
                    Calculate.Add();
                    break;
                case '-':
                    Calculate.Input();
                    Calculate.Subtract();
                    break;
                case '*':
                    Calculate.Input();
                    Calculate.Multiply();
                    break;
                case '/':
                    Calculate.Input();
                    Calculate.Divide();
                    break;
                case 'E':
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }

    }
}