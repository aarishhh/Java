//WAP Replace All Negative Numbers In A 1D Array With Zero 
import java.util.Scanner;

public class Q51_Replace {
    Scanner Replace = new Scanner(System.in);
    int Number[], Num;
    void Input() {
        System.out.print("Enter Number OF Elements In The Array: ");
        Num = Replace.nextInt();
        Number = new int[Num];
        System.out.println("Enter The Elements: ");
        for (int i = 0; i < Num; i++) {
            Number[i] = Replace.nextInt();
        }
    }
    void Output() {
        int Replace = 0;
        System.out.println("After Replacing: ");
        for(int i = 0; i < Num; i++) {
            if(Number[i] < 0) {
                Number[i] = Replace;
                System.out.println(Replace);
            }
            else {
                System.out.println(Number[i]);
            }
        }
    }
    public static void main(String[] args) {
        Q51_Replace Obj = new Q51_Replace();
        Obj.Input();
        Obj.Output();
    }
}

