import java.util.Scanner;

public class Q00_Constructor_Example {
    int Num1, Num2;
    Q00_Constructor_Example() {
        Scanner Constructor = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        Num1 = Constructor.nextInt();
        System.out.print("Enter 2nd Number: ");
        Num2 = Constructor.nextInt();
        Constructor.close();
    }
    void Output() {
        System.out.println("The Addition Of: \n" + Num1 + " + " + Num2 + " = " + (Num1 + Num2));
    }
    public static void main(String[] args) {
        Q00_Constructor_Example Obj = new Q00_Constructor_Example();
        Obj.Output();
    }
}
