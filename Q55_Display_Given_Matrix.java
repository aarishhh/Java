import java.util.Scanner;

public class Q55_Display_Given_Matrix {
    Scanner Display_Matrix = new Scanner(System.in);
    int Rows, Columns;
    int Matrix[][];
    void Input() {
        System.out.print("Enter Number Of Rows: ");
        Rows = Display_Matrix.nextInt();
        System.out.print("Enter Number Of Columns: ");
        Columns = Display_Matrix.nextInt();
        Matrix = new int[Rows][Columns];
        System.out.println("Enter Elements In Rows-Wise: ");
        for(int i = 0; i < Rows; i++) {
            for(int j = 0; j < Columns; j++) {
                Matrix[i][j] = Display_Matrix.nextInt();
            }
        }
    }
    void Output() {
        System.out.println("The Matrix Is:");
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                System.out.print(Matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Q55_Display_Given_Matrix Obj = new Q55_Display_Given_Matrix();
        Obj.Input();
        Obj.Output();
    }
}
