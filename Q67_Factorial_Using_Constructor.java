//WAP To Find Factorial Of Given Number Using Default Constructor.
import java.util.Scanner;

public class Q67_Factorial_Using_Constructor {
    int Num, Factorial = 1;

    Q67_Factorial_Using_Constructor() {
        Scanner Factorial_Num = new Scanner(System.in);
        System.out.print("Enter A Number To Get Factorial: ");
        Num = Factorial_Num.nextInt();
        for (int i = 1; i <= Num; i++) {
            Factorial = Factorial * i;
        }
        Factorial_Num.close();
    }

    void Output() {
        System.out.println("Factorial Of " + Num + " Is " + Factorial);
    }

    public static void main(String[] args) {
        Q67_Factorial_Using_Constructor Obj = new Q67_Factorial_Using_Constructor();
        Obj.Output();
    }
}
