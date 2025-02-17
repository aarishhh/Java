import java.util.Scanner;

public class Q0_Function_Example {
    Scanner Sc = new Scanner(System.in);
    int a, b, c;

    void Function_Input() {
        System.out.print("Enter 1st Number: ");
        a = Sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        b = Sc.nextInt();
    }

    void Function_Output() {
        System.out.println("Addition = " + c);
    }

    void Function_Add() {
        c = a + b;
    }

    public static void main(String[] args) {
        Q0_Function_Example obj = new Q0_Function_Example();
        obj.Function_Input();
        obj.Function_Add();
        obj.Function_Output();
    }

}
