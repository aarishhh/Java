//WAP To Find The Sum Of All Elements In A Given 1D Array. Ask Number Of Elements To User.
import java.util.Scanner;
public class Q44_Sum_Of_All_Elements_In_Array {
    Scanner Sum_of_Array = new Scanner(System.in);
    int Num;
    int Number[];

    void Input() {
        System.out.print("Enter The Size Of Array: ");
        Num = Sum_of_Array.nextInt();
        Number = new int[Num];
        System.out.println("Enter The Elements Of Array: ");
        for (int i = 0; i < Num; i++) {
            Number[i] = Sum_of_Array.nextInt();
        }
    }

    void Sum() {
        int Sum = 0;
        for (int i = 0; i < Num; i++) {
            Sum += Number[i];
        }
        System.out.println("Sum Of All Elements In The Array Is: " + Sum);
    }

    public static void main(String[] args) {
        Q44_Sum_Of_All_Elements_In_Array Obj = new Q44_Sum_Of_All_Elements_In_Array();
        Obj.Input();
        Obj.Sum();
    }
}