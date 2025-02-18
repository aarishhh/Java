//Write a Program To Find Circumstance Of Circle.
import java.util.Scanner;
public class Q08_Circumference_Of_Circle {
    public static void main(String[] args) {
        Scanner Circumference_Of_Circle = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle To Get Circumference: ");
        float Radius = Circumference_Of_Circle.nextFloat();
        float Circumference = 2 * 3.14f * Radius;
        System.out.println("Circumference Of Circle With Radius " + Radius + " Is " + Circumference);
        Circumference_Of_Circle.close();
    }
}
