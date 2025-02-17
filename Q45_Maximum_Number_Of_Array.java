//WAP To Find Maximum Value In Given 1D Array. Take Number Of Elements From User. 
import java.util.Scanner;
public class Q45_Maximum_Number_Of_Array {
    Scanner Maximum = new Scanner(System.in);
    int Num; 
    int Number[];
    void Input() {
        System.out.print("Enter Number Of Elements: ");
        Num = Maximum.nextInt();
        Number = new int[Num];
        System.out.print("Enter The Elements: ");
        for(int i = 0; i < Num; i++) {
            Number[i] = Maximum.nextInt();
        }
    }
    void Maximum_Number() {
        int Max = Number[0];
        for(int i = 0; i < Num; i++) {
            if(Number[i] > Max) {
                Max = Number[i];
            }
        }
        System.out.println("The Maximum Value Is "+ Max);
    }
    public static void main(String[] args) {
        Q45_Maximum_Number_Of_Array obj = new Q45_Maximum_Number_Of_Array();
        obj.Input();
        obj.Maximum_Number();
    }
}
