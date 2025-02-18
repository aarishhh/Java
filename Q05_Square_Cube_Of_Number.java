//Write A Program To Find Square And Cube Of Given Number.
import java.util.Scanner;

public class Q05_Square_Cube_Of_Number {
    public static void main(String[] args) {
        Scanner Square_Cube_Of_Number = new Scanner(System.in);
        System.out.println("Give A Number To Get Its Square And Cube Root: ");
        int Number = Square_Cube_Of_Number.nextInt();
        System.out.println("Square Of " + Number + " = " + (Number * Number));
        System.out.println("Cube Of " + Number + " = " + (Number * Number * Number));
        Square_Cube_Of_Number.close();
    }
}
