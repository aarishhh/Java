//WAP To Find The Avarage Of Elements In A 1D Array
import java.util.Scanner;

public class Q52_Average_Of_Array_Elements {
    Scanner Average = new Scanner(System.in);
    int Num, Number[];
    void Input() {
        System.out.print("Enter The Size Of Array: ");
        Num = Average.nextInt();
        Number = new int[Num];
        System.out.println("Enter The Elements Of Array: ");
        for (int i = 0; i < Num; i++) {
            Number[i] = Average.nextInt();
        }
    }

    void Sum() {
        float Sum = 0;
        for (int i = 0; i < Num; i++) {
            Sum += Number[i];
        }
        System.out.println("Average Of Elements Of Array Is: " + (Sum / Num));
    }

    public static void main(String[] args) {
        Q52_Average_Of_Array_Elements Obj = new Q52_Average_Of_Array_Elements();
        Obj.Input();
        Obj.Sum();
    }
}
