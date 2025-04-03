import java.util.Scanner;

public class Q70_Rectangle {
    Scanner Rectangle = new Scanner(System.in);
    double Length, Width;

    Q70_Rectangle(double Length, double Width) {
        System.out.print("Enter Length Of Rectangle: ");
        Length = Rectangle.nextDouble();
        System.out.print("Enter Width Of Rectangle: ");
        Width = Rectangle.nextDouble();
        this.Length = Length;
        this.Width = Width;
    }

    void CalculateArea() {
        System.out.printf("Area Of Rectangle = %.2f\n", Length * Width);
    }

    void CalculatePerimeter() {
        System.out.printf("Perimeter Of Rectangle = %.2f", 2 * (Length + Width));
    }

    public static void main(String[] args) {
        Q70_Rectangle Obj = new Q70_Rectangle(0, 0);
        Obj.CalculateArea();
        Obj.CalculatePerimeter();
    }
}
