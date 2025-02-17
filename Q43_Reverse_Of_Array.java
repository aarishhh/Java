
//WAP To Input An 1D Array And Print It In Reverse Order, Without Using In-Built Function.
import java.util.Scanner;

public class Q43_Reverse_Of_Array {
    Scanner Reverse = new Scanner(System.in);
    int i, Num;
    int Number[];

    void Input() {
        System.out.print("Enter Number OF Elements In The Array: ");
        Num = Reverse.nextInt();
        Number = new int[Num];
        System.out.print("Enter The Elements: ");
        for (i = 0; i < Num; i++) {
            Number[i] = Reverse.nextInt();
        }
    }

    void Reverse_Array() {
        System.out.println("Reverse Of The Array Is: ");
        for (i = Num - 1; i >= 0; i--) {
            System.out.println(Number[i] + " ");
        }
    }

    public static void main(String[] args) {
        Q43_Reverse_Of_Array Obj = new Q43_Reverse_Of_Array();
        Obj.Input();
        Obj.Reverse_Array();
    }
}
