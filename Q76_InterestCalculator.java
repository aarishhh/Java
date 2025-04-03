public class Q76_InterestCalculator {
    double CalculateInterest(double Principal, double Rate) {
        return (Principal * Rate) / 100;
    }
    
    double CalculateInterest(double Principal, double Rate, double Time) {
        return (Principal * Rate * Time) / 100;
    }
    public static void main(String[] args) {
        Q76_InterestCalculator Obj = new Q76_InterestCalculator();
        System.out.println("The Simple Interest For 1 Year Is: " + Obj.CalculateInterest(10000, 10));
        System.out.println("Simple Interest Is: " + Obj.CalculateInterest(10000.0, 10, 2));
    }
}
