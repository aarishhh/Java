
//WAP To Find The Second Largest Element In Given 1D Array.
import java.util.Scanner;

public class Q53_2nd_Largest_Number_In_Array {
    Scanner Second_Largest = new Scanner(System.in);
    int Num, Number[];

    void Input() {
        System.out.print("Enter The Number Of Elements: ");
        Num = Second_Largest.nextInt();
        Number = new int[Num];
        System.out.println("Enter The Elements: ");
        for (int i = 0; i < Num; i++) {
            Number[i] = Second_Largest.nextInt();
        }
    }

    void Finding() {
        int Max = Number[0];
        int Second_Max = Number[0];
        for (int i = 0; i < Num; i++) {
            if (Number[i] > Max) {
                Max = Number[i];
            }
        }
        for (int i = 0; i < Num; i++) {
            if (Number[i] > Second_Max && Number[i] < Max) {
                Second_Max = Number[i];
            }
        }
        System.out.println("The 2nd Greatest Number Is: " + Second_Max);
    }

    public static void main(String[] args) {
        Q53_2nd_Largest_Number_In_Array Obj = new Q53_2nd_Largest_Number_In_Array();
        Obj.Input();
        Obj.Finding();
    }
}
