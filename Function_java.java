import java.util.Scanner;

public class Function_java {
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
        Function_java obj = new Function_java();
        obj.Function_Input();
        obj.Function_Add();
        obj.Function_Output();
    }

}
