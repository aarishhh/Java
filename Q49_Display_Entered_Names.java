import java.util.Scanner;

public class Q49_Display_Entered_Names {
    Scanner Names = new Scanner(System.in);
        String Name[] = new String[5];
        void Input() {
            System.out.println("Enter Five Names: ");
            for(int i = 0; i < 5; i++) {
                System.out.print("Name " + (i + 1) + ": ");
                Name[i] = Names.nextLine();
            }
            Names.close();
        }
        void Output() {
            System.out.println("The Entered Name Are: ");
            for(int i = 0; i < 5; i++) {
                System.out.print("Name " + (i + 1) + ": " + Name[i] + "\n");
            }
        }
        public static void main(String[] args) {
            Q49_Display_Entered_Names Obj = new Q49_Display_Entered_Names();
            Obj.Input();
            Obj.Output();
        }
}
