//Write A Program To Find Area Of Ractangle.
import java.util.Scanner;

public class Q11_Area_Of_Rectangle {
    public static void main(String[] args) {
        Scanner Area_Of_Rectangle = new Scanner(System.in);
        System.out.println("Enter The Length Of Ractangle: ");
        int Length = Area_Of_Rectangle.nextInt();
        System.out.println("Enter The Width Of Ractangle: ");
        int Width = Area_Of_Rectangle.nextInt();
        System.out.println("Area Of Ractangle Is: " + (Length * Width));
        Area_Of_Rectangle.close();
    }
}