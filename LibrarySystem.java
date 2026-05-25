import java.util.Scanner;
class Book {
    int bookId;
    String title;
    String author;
    boolean isIssued;
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
    void displayBook() {
        System.out.println("ID: " + bookId + " | Title: " + title + " | Author: " + author + " | Status: " + (isIssued ? "Issued" : "Available"));
    }
    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book '" + title + "' has been issued.");
        } else {
            System.out.println("Sorry, the book '" + title + "' is already issued.");
        }
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = {
            new Book(1, "Java Programming", "James Gosling"),
            new Book(2, "C++ Basics", "Bjarne Stroustrup"),
            new Book(3, "Python Essentials", "Guido van Rossum")
        };
        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Display Available Books");
            System.out.println("2. Search Book by Title");
            System.out.println("3. Issue Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Books:");
                    for (Book b : books) {
                        b.displayBook();
                    }
                    break;
                case 2:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = sc.nextLine();
                    boolean found = false;
                    for (Book b : books) {
                        if (b.title.equalsIgnoreCase(searchTitle)) {
                            b.displayBook();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter book ID to issue: ");
                    int id = sc.nextInt();
                    boolean issued = false;
                    for (Book b : books) {
                        if (b.bookId == id) {
                            b.issueBook();
                            issued = true;
                            break;
                        }
                    }
                    if (!issued) {
                        System.out.println("Invalid Book ID!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Library System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
