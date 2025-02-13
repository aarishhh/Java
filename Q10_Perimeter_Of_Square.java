//Write A Program To Find Perimeter Of A Square.
import java.util.Scanner;

public class Q10_Perimeter_Of_Square {
     public static void main(String[] args) {
        Scanner Perimeter_Of_Square = new Scanner(System.in);
        System.out.println("Enter The Length Of The Side Of Square: ");
        int Side = Perimeter_Of_Square.nextInt();
        System.out.println("Perimeter Of Square Is: "+(4*Side));
        Perimeter_Of_Square.close();
}
}