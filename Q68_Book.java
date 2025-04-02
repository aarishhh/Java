import java.util.Scanner;

public class Q68_Book {
    Scanner Book = new Scanner(System.in);
    String Author;
    String Title;
    double Price;

    Q68_Book() {
        Title = "Unknown";
        Author = "Unknown";
        Price = 0.0;
    }

    Q68_Book(String title, String author, double price) {
        System.out.print("Enter Title Name: ");
        Title = Book.nextLine();
        System.out.print("Enter Author's Name: ");
        Author = Book.nextLine();
        System.out.print("Enter Price: ");
        Price = Book.nextInt();
    }
    void DisplayDetails() {
        System.out.println("The Title Of The Book Is: " + Title);
        System.out.println("The Author Of The Book Is: " + Author);
        System.out.println("The Price Of The Book Is: " + Price);
    }
    public static void main(String[] args) {
        Q68_Book Object = new Q68_Book(" ", " " , 0.0);
        Object.DisplayDetails();
    }
 
}
   

