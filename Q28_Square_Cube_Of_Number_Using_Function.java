//WAP To Find Square And Cube Of Given Number.
import java.util.Scanner;

public class Q28_Square_Cube_Of_Number_Using_Function {
    Scanner Square_Cube = new Scanner(System.in);
    int Number;

    void Input() {
        System.out.print("Enter The Number: ");
        Number = Square_Cube.nextInt();
    }

    void Square_Cube() {
        System.out.println("Square Of " + Number + " Is: " + Number * Number); // Square
        System.out.println("Cube Of " + Number + " Is: " + Number * Number * Number); // Cube
    }
    public static void main(String[] args) {
        Q28_Square_Cube_Of_Number_Using_Function SquareCube = new Q28_Square_Cube_Of_Number_Using_Function();
        SquareCube.Input();
        SquareCube.Square_Cube();
    }
}