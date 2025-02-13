// Write A Program To Find Area Of Circle.
import java.util.Scanner;

public class Q7_Area_Of_Circle {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The Radius: ");
        float Radius;
        Radius = Sc.nextFloat();
        float Area = 3.14f*Radius*Radius;
        System.out.println("Area is: "+Area);
        Sc.close();

    }
}
