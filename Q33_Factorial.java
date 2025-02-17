
//WAP To Find Factorial Of Given Number.
import java.util.Scanner;

public class Q33_Factorial {
    Scanner Factorial_Of_Number = new Scanner(System.in);
    int Num, Fact = 1;

    void Input() {
        System.out.println("Enter A Number: ");
        Num = Factorial_Of_Number.nextInt();
    }

    void Calculate() {
        for (int i = 1; i <= Num; i++) {
            Fact = Fact * i;
        }
    }

    void Output() {
        System.out.println("Factorial Of " + Num + " Is: " + Fact);
    }

    public static void main(String[] args) {
        Q33_Factorial obj = new Q33_Factorial();
        obj.Input();
        obj.Calculate();
        obj.Output();
    }
}