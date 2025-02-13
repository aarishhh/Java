import java.util.Scanner;

public class Swap_Two_Numbers_Using_Function {
    Scanner Swap = new Scanner(System.in);
    int Number_1, Number_2, Temp;
    void Input() {
        System.out.print("Enter The First Number: ");
        Number_1 = Swap.nextInt();
        System.out.print("Enter The Second Number: ");
        Number_2 = Swap.nextInt();
    }
    void Swaping() {
        System.out.println("Before Swaping The First Number Is: " + Number_1);
        System.out.println("Before Swaping The Second Number Is: " + Number_2);
        Temp = Number_1;
        Number_1 = Number_2;
        Number_2 = Temp;
    }
    void Output() {
        System.out.println("After Swaping The First Number Is: " + Number_1);
        System.out.println("After Swaping The Second Number Is: " + Number_2);
    }
    public static void main(String[] args) {
        Swap_Two_Numbers_Using_Function Swap = new Swap_Two_Numbers_Using_Function();
        Swap.Input();
        Swap.Swaping();
        Swap.Output();
    }
}