//WAP To Sort A 1D Array In Ascending Order.
import java.util.Scanner;

public class Q48_Printing_Array_In_Ascending_Order {
    Scanner  Ascending_Order= new Scanner(System.in);
    int Num, Number[];

    void Input() {
        System.out.print("Enter Number Of Elements In Array: ");
        Num = Ascending_Order.nextInt();
        Number = new int[Num];
        System.out.print("Enter The Elements: ");
        for (int i = 0; i < Num; i++) {
            Number[i] = Ascending_Order.nextInt();
        }
        Ascending_Order.close();
    }

    void Ascending() {
        System.out.print("Ascending Order:");
        for (int i = 0; i < Num; i++) {
            for (int j = i + 1; j < Num; j++) {
                if (Number[i] > Number[j]) {
                    int Temp;
                    Temp = Number[i];
                    Number[i] = Number[j];
                    Number[j] = Temp;
                }
            }
        }
        for (int i = 0; i < Num; i++) {
            System.out.print(" " + Number[i]);
        }
    }

    public static void main(String[] args) {
        Q48_Printing_Array_In_Ascending_Order Obj = new Q48_Printing_Array_In_Ascending_Order();
        Obj.Input();
        Obj.Ascending();
    }
}
