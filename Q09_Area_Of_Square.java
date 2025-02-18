//Write A Program To Find Area Of Square.
import java.util.Scanner;

public class Q09_Area_Of_Square {
    public static void main(String[] args) {
        Scanner Area_Of_Square = new Scanner(System.in);
        System.out.println("Enter The Length Of The Side Of Square: ");
        int Side = Area_Of_Square.nextInt();
        System.out.println("Area Of Square Is: "+(Side*Side));
        Area_Of_Square.close();
    }
}
