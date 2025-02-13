import java.util.Scanner;

public class OneD_Array_Print_All_Numbers {
    Scanner Array = new Scanner(System.in);
    int Number[] = new int[10];
    int i;

    void Input() {
        System.out.print("Enter 10 Numbers: ");
        for (i = 0; i < 10; i++) {
            Number[i] = Array.nextInt();
        }
    }
    void Output() {
        System.out.print("The Numbers You Have Entered Are: ");
        for(i = 0; i < 10; i++) {
            System.out.print(" " +Number[i]);
        }
    }
    public static void main(String[] args) {
        OneD_Array_Print_All_Numbers Obj = new OneD_Array_Print_All_Numbers();
        Obj.Input();
        Obj.Output();
    }
    
}
