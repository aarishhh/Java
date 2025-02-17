
//WAP To Print Fibonacci Series Up To N Terms.
import java.util.Scanner;

public class Q35_Fibonacci_Series {
    Scanner Fibonacci_Series = new Scanner(System.in);
    int Num;

    void Input() {
        System.out.print("Enter A Number: ");
        Num = Fibonacci_Series.nextInt();
    }

    void Output() {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < Num; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Q35_Fibonacci_Series obj = new Q35_Fibonacci_Series();
        obj.Input();
        obj.Output();
    }
}