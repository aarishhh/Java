//WAP To Add Given Two Numbers Using Default Constructor.
import java.util.Scanner;

public class Q66_Addition_Using_Constructor {
    int Num1, Num2;
    Q66_Addition_Using_Constructor() {
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
        Q66_Addition_Using_Constructor Obj = new Q66_Addition_Using_Constructor();
        Obj.Output();
    }
}
