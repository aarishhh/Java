import java.util.Scanner;

public class Square_And_Cube_Of_Number {
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
        Square_And_Cube_Of_Number SquareCube = new Square_And_Cube_Of_Number();
        SquareCube.Input();
        SquareCube.Square_Cube();
    }
}