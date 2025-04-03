public class Q71_Calculator {
    int Calculate(int Num1, int Num2) {
        return Num1 + Num2;
    }
    double Calculate(double Num1, double Num2) {
        return Num1 * Num2;
    }
    int Calculate(int Num1, int Num2, int Num3) {
      return Num1 + Num2 + Num3;  
    }
    public static void main(String[] args) { 
        Q71_Calculator Obj = new Q71_Calculator();
        System.out.println("Addition = " + Obj.Calculate(100, 150));
        System.out.println("Multiplication = " + Obj.Calculate(15.0, 2));
        System.out.println("Addition Of Three Numbers = " + Obj.Calculate(100, 150, 50));
    }

}
