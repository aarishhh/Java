public class Q00_Parameterised_Constructor {
    int A, B;

    Q00_Parameterised_Constructor() // Default
    {
        System.out.println("I Am Default Constructor");
        A = 0;
        B = 0;
    }

    Q00_Parameterised_Constructor(int X, int Y) // Parameterised C
    {
        System.out.println("I Am Parameterised Constructor");
        A = X;
        B = Y;
    }

    Q00_Parameterised_Constructor(int X) {
        System.out.println("I Am One Int Parameter Constructor");
        A = X;
        B = 0;
    }

    Q00_Parameterised_Constructor(float X) {
        System.out.println("I Am One Float Parameter Constructor");
        A = (int) X;
        B = 0;
    }

    void output() {
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }

    public static void main(String[] args) {
        Q00_Parameterised_Constructor Obj = new Q00_Parameterised_Constructor(11.5f);
        Obj.output();
    }
}