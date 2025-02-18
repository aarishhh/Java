
//WAP To Count The Occurrences Of A Specific Element In A 1D Array.
import java.util.Scanner;

public class Q47_Check_Occurrence_Of_Element_In_Array {
    Scanner Occurrence = new Scanner(System.in);
    int Num, Number[], Traget, Occurrences = 0;

    void Input() {
        System.out.print("Enter Number Of Elements In Array: ");
        Num = Occurrence.nextInt();
        Number = new int[Num];
        System.out.print("Enter The Elements: ");
        for (int i = 0; i < Num; i++) {
            Number[i] = Occurrence.nextInt();
        }
        System.out.print("Enter The Elements Of Which You Want To Check Occurrence: ");
        Traget = Occurrence.nextInt();
    }

    void Check_Occurrence() {
        for (int I = 0; I < Num; I++) {
            if (Traget == Number[I]) {
                Occurrences++;
            }
        }
        System.out.println(Traget + " Has Occurred " + Occurrences + " Times ");
    }

    public static void main(String[] args) {
        Q47_Check_Occurrence_Of_Element_In_Array Obj = new Q47_Check_Occurrence_Of_Element_In_Array();
        Obj.Input();
        Obj.Check_Occurrence();
    }
}