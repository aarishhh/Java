public class Q75_MaxFinder {
    int FindMax(int Num1, int Num2) {
        if (Num1 > Num2) {
            return Num1;
        } else {
            return Num2;
        }
    }

    int FindMax(int Num1, int Num2, int Num3) {
        if (Num1 > Num2 && Num1 > Num3) {
            return Num1;
        } else if (Num2 > Num3 && Num2 > Num1) {
            return Num2;
        } else {
            return Num3;
        }
    }

    double FindMax(double Num1, double Num2) {
        if (Num1 > Num2) {
            return Num1;
        } else {
            return Num2;
        }
    }

    double FindMax(double Num1, double Num2, double Num3) {
        if (Num1 > Num2 && Num1 > Num3) {
            return Num1;
        } else if (Num2 > Num3 && Num2 > Num1) {
            return Num2;
        } else {
            return Num3;
        }
    }
    public static void main(String[] args) {
        Q75_MaxFinder Obj = new Q75_MaxFinder();
        System.out.println("Greatest Number Is: " + Obj.FindMax(20, 30));
        System.out.println("Greatest Number Is: " + Obj.FindMax(20, 30, 40));
        System.out.println("Greatest Number Is: " + Obj.FindMax(20.0, 30.0));
        System.out.println("Greatest Number Is: " + Obj.FindMax(20.0, 30.0, 40.0));
    }
}