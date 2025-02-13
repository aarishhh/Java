//Write A Program To Find Perimeter Of A Rectangle.
import java.util.Scanner;
public class Q12_Perimeter_Of_Rectangle {
    public static void main(String[] args) {
        Scanner Perimeter_Of_Rectangle = new Scanner(System.in);
        System.out.println("Enter The Length Of Ractangle: ");
        int Length = Perimeter_Of_Rectangle.nextInt();
        System.out.println("Enter The Width Of Ractangle: ");
        int Width = Perimeter_Of_Rectangle.nextInt();
        System.out.println("Perimeter Of Ractangle Is: " + (2*(Length + Width)));
        Perimeter_Of_Rectangle.close();
    }
}