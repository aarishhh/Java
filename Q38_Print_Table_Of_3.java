
//WAP To Print Multiple Of 3 Up To Given Number.
import java.util.Scanner;

public class Q38_Print_Table_Of_3 {
    Scanner Table_Of_3 = new Scanner(System.in);
    int Num;

    void Input() {
        System.out.println("Enter A Number: ");
        Num = Table_Of_3.nextInt();
    }

    void Output() {
        for (int i = 1; i <= Num; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Q38_Print_Table_Of_3 obj = new Q38_Print_Table_Of_3();
        obj.Input();
        obj.Output();
    }
}