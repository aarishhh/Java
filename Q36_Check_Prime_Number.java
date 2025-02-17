
//WAP To Check Given Number Is Prime Or Not.
import java.util.Scanner;

public class Q36_Check_Prime_Number {
    Scanner Prime = new Scanner(System.in);
    int Num;
    int Flag = 0;

    void Input() {
        System.out.println("Enter A Number: ");
        Num = Prime.nextInt();
    }

    void Logic() {
        for (int i = 2; i < Num; i++) {
            if (Num % i == 0) {
                Flag = 1;
                break;
            }
        }
    }

    void Output() {
        if (Flag == 0) {
            System.out.println(Num + " Is A Prime Number.");
        } else {
            System.out.println(Num + " Is Not A Prime Number.");
        }
    }

    public static void main(String[] args) {
        Q36_Check_Prime_Number obj = new Q36_Check_Prime_Number();
        obj.Input();
        obj.Logic();
        obj.Output();
    }
}