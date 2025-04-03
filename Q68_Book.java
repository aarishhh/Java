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

    Q68_Book(String Title, String Author, double Price) {
        System.out.print("Enter Title Name: ");
        Title = Book.nextLine();
        System.out.print("Enter Author's Name: ");
        Author = Book.nextLine();
        System.out.print("Enter Price: ");
        Price = Book.nextInt();
        this.Title = Title;
        this.Author = Author;
        this.Price = Price;
    }

    void DisplayDetails() {
        System.out.println("The Title Of The Book Is: " + Title);
        System.out.println("The Author Of The Book Is: " + Author);
        System.out.printf("The Price Of The Book Is: %.2f" + Price);
    }

    public static void main(String[] args) {
        Q68_Book Object = new Q68_Book(" ", " ", 0.0);
        Object.DisplayDetails();
    }

}
