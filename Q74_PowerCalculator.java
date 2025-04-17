public class Q74_PowerCalculator {
    
    int Power(int Base, int Exponent) {
        int Result = 1;
        for(int i = 0; i < Exponent; i++) {
            Result *= Base;
        }
        return Result;
    }
    
    double Power(double Base, int Exponent) {
        double Result = 1;
        for(int i = 0; i < Exponent; i++) {
            Result *= Base;
        }
        return Result;
    }
    
    int Power(int Base) {
        return Base * Base;
    }
    public static void main(String[] args) {
        Q74_PowerCalculator Obj = new Q74_PowerCalculator();
        System.out.println(Obj.Power(2, 3));
        System.out.println(Obj.Power(10.0, 3));
        System.out.println(Obj.Power(10));
    }
}
