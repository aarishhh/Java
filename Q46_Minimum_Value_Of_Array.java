//WAP To Find Minimum Value In Given 1D Array. Take Number Of Elements From User.
import java.util.Scanner;

public class Q46_Minimum_Value_Of_Array {
    Scanner Minimum = new Scanner(System.in);
    int Num, Number[];

    void Input() {
        System.out.print("Enter The Number Of Elements: ");
        Num = Minimum.nextInt();
        Number = new int[Num];
        System.out.print("Enter The Elements: ");
        for (int i = 0; i < Num; i++) {
            Number[i] = Minimum.nextInt();
        }
    }

    void Minimum_Number() {
        int Min = Number[0];
        for (int i = 1; i < Num; i++) {
            if (Number[i] < Min) {
                Min = Number[i];
            }
        }
        System.out.println("The Minimum Value Is: " + Min);
    }

    public static void main(String[] args) {
        Q46_Minimum_Value_Of_Array Obj = new Q46_Minimum_Value_Of_Array();
        Obj.Input();
        Obj.Minimum_Number();
    }

}
