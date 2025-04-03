public class Q72_Shape {
    int Area(int Side) {
        return Side * Side;
    }
    
    int Area(int Length, int Width) {
        return Length * Width;
    }
    
    double Area(double Radius) {
        return 3.14 * Radius * Radius;
    }
    public static void main(String[] args) {
        Q72_Shape Obj = new Q72_Shape();
        System.out.println("Area Of Square Is: " + Obj.Area(24));
        System.out.println("Area Of Rectangle Is: " + Obj.Area(24, 14));
        System.out.println("Area Of Circle Is: " + Obj.Area(30.0));
    }
}
