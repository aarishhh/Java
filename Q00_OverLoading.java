import java.util.Scanner;

public class Q00_OverLoading {
    int Num1, Num2;
    int Addition() {
        Scanner Add = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        System.out.print("Enter 1st Number: ");
        int Num1 = Add.nextInt();
        System.out.print("Enter 2nd Number: ");
        int Num2 = Add.nextInt();
        int Result = Num1 + Num2;
        Add.close();
        return Result;
    }

    public static void main(String[] args) {
        Q00_OverLoading Obj = new Q00_OverLoading();
        System.out.print("Addition = " + Obj.Addition());
    }
}
