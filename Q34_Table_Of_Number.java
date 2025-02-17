
//WAP To Find Table Of Given Number.
import java.util.Scanner;

public class Q34_Table_Of_Number {
    Scanner Table = new Scanner(System.in);
    int Num;

    void Input() {
        System.out.println("Enter A Number: ");
        Num = Table.nextInt();
    }

    void Output() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Num + " * " + i + " = " + Num * i);
        }
    }

    public static void main(String[] args) {
        Q34_Table_Of_Number obj = new Q34_Table_Of_Number();
        obj.Input();
        obj.Output();
    }

}