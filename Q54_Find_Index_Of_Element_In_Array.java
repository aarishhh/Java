//WAP To Find The Index Of A Specific Element In A 1D Array.
import java.util.Scanner;

public class Q54_Find_Index_Of_Element_In_Array {
    Scanner Index = new Scanner(System.in);
    int Number[], Num, Index_Number;
    void Input() {
        System.out.print("Enter The Number Of Elements: ");
        Num = Index.nextInt();
        Number = new int[Num];
        System.out.println("Enter The Elements: ");
        for (int i = 0; i < Num; i++) {
            Number[i] = Index.nextInt();
        }
        System.out.print("Enter The Number You Want To Find The Index Of: ");
        Index_Number = Index.nextInt();
        Index.close();
    }
    void Index() {
        int Index_Num = 0;
        for(int i = 0; i < Num; i++) {
            if(Number[i] == Index_Number) {
                Index_Num = i;
            }
        }
        System.out.println("The Index Of " + Index_Number + " Is " + Index_Num);
    }
    public static void main(String[] args) {
        Q54_Find_Index_Of_Element_In_Array Obj = new Q54_Find_Index_Of_Element_In_Array();
        Obj.Input();
        Obj.Index();
    }
}
