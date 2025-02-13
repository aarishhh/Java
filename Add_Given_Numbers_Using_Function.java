import java.util.Scanner;

public class Add_Given_Numbers_Using_Function {
    Scanner Add_Given_Numbers_Using_Function = new Scanner(System.in);
    int A, B, C;
    void Input() {
        System.out.print("Enter 1st Number: ");
        A = Add_Given_Numbers_Using_Function.nextInt();
        System.out.print("Enter 2nd Number: ");
        B = Add_Given_Numbers_Using_Function.nextInt();
    }
    void Add() {
        C = A + B;
    }
    void Output() {
        System.out.println("Addition = " + C);
    }
    public static void main(String[] args) {
        Add_Given_Numbers_Using_Function Fun = new Add_Given_Numbers_Using_Function();
        Fun.Input();
        Fun.Add();
        Fun.Output();
    }
}
