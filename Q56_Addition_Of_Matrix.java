//WAP To Add Two Given Matrices.
import java.util.Scanner;

public class Q56_Addition_Of_Matrix {
    Scanner Addition = new Scanner(System.in);
    int Rows, Columns, Sum[][];
    int Matrix1[][], Matrix2[][];

    void Input() {
        System.out.print("Enter Number Of Rows: ");
        Rows = Addition.nextInt();
        System.out.print("Enter Number Of Columns: ");
        Columns = Addition.nextInt();
        Matrix1 = new int[Rows][Columns];
        Matrix2 = new int[Rows][Columns];
        Sum = new int[Rows][Columns];
        System.out.println("Enter Elements Of First Matrix:");
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                Matrix1[i][j] = Addition.nextInt();
            }
        }
        System.out.println("Enter Elements Of Second Matrix:");
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                Matrix2[i][j] = Addition.nextInt();
            }
        }
        Addition.close();
    }
    void Adding() {
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                Sum[i][j] = Matrix1[i][j] + Matrix2[i][j];
            }
        }
        System.out.println("Sum Of The Matrices:");
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                System.out.print(Sum[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Q56_Addition_Of_Matrix Obj = new Q56_Addition_Of_Matrix();
        Obj.Input();
        Obj.Adding();
    }
}
