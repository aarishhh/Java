//WAP To Find Transpose Of Given Matrix And Display It.
import java.util.Scanner;

public class Q57_Transpose_Of_Matrix {
    Scanner Transpose_Matrix = new Scanner(System.in);
    int Matrix[][], Transpose[][];
    int Rows, Columns;
    void Input() {
        System.out.print("Enter Number Of Rows: ");
        Rows = Transpose_Matrix.nextInt();
        System.out.print("Enter Number Of Columns: ");
        Columns = Transpose_Matrix.nextInt();
        Matrix = new int[Rows][Columns];
        Transpose = new int[Columns][Rows];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                Matrix[i][j] = Transpose_Matrix.nextInt();
            }
        }
        Transpose_Matrix.close();
    }
    void Main() {
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                Transpose[j][i] = Matrix[i][j];
            }
        }
        System.out.println("Original Matrix:");
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose Of Matrix:");
        for (int i = 0; i < Columns; i++) {
            for (int j = 0; j < Rows; j++) {
                System.out.print(Transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Q57_Transpose_Of_Matrix Obj = new Q57_Transpose_Of_Matrix();
        Obj.Input();
        Obj.Main();
    }
}
