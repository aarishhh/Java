import java.util.Scanner;

public class Q68_Book {
    Scanner Book = new Scanner(System.in);
    String Authorr;
    String Titlee;
    double Pricee;

    Q68_Book() {
        Titlee = "Unknown";
        Authorr = "Unknown";
        Pricee = 0.0;
    }

    Q68_Book(String Title, String Author, double Price) {
        System.out.print("Enter Title Name: ");
        Title = Book.nextLine();
        System.out.print("Enter Author's Name: ");
        Author = Book.nextLine();
        System.out.print("Enter Price: ");
        Price = Book.nextInt();
        Titlee = Title;
        Authorr = Author;
        Pricee = Price;
    }
    void DisplayDetails() {
        System.out.println("The Title Of The Book Is: " + Titlee);
        System.out.println("The Author Of The Book Is: " + Authorr);
        System.out.println("The Price Of The Book Is: " + Pricee);
    }
    public static void main(String[] args) {
        Q68_Book Obj = new Q68_Book();
        Q68_Book Object = new Q68_Book(" ", " " , 0.0);
        Object.DisplayDetails();
    }
 
}
   

