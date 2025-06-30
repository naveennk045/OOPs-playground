import models.Book;
import models.Category;
import models.User;
import service.BookService;
import service.UserService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // Initialize services
        BookService bookService = new BookService();
        UserService userService = new UserService();

        // --- Dummy Users ---
        userService.addUser("Alice", "Johnson", 25, "alice@gmail.com", "9876543210");
        userService.addUser("Bob", "Smith", 30, "bob@gmail.com", "9876500000");

        // Get all users
        System.out.println("All Registered Users:");
        userService.getAllUsers();


        // --- Dummy Books ---
        bookService.addBook("Clean Code", "Robert Martin", Category.SCIENCE, 2008, 5);
        bookService.addBook("Harry Potter", "J.K. Rowling", Category.FANTASY, 1997, 3);
        bookService.addBook("A Brief History of Time", "Stephen Hawking", Category.SCIENCE, 1988, 2);
        bookService.addBook("The Hobbit", "J.R.R. Tolkien", Category.FANTASY, 1937, 4);

        // Get all books
        System.out.println("\nAll Books in Library:");
        for (Book book : bookService.getAllBooks()) {
            System.out.println(book);
        }

        // --- Issue a Book ---
        Book bookToIssue = bookService.searchByTitle("Clean Code").get(0);
        System.out.println("\nIssuing 'Clean Code'...");
        bookService.issueBook(bookToIssue);
        System.out.println("After issue: " + bookToIssue);

        // --- Return the Book ---
        System.out.println("\nReturning 'Clean Code'...");
        bookService.returnBook(bookToIssue);
        System.out.println("After return: " + bookToIssue);

        // --- Search by Author ---
        System.out.println("\nBooks by J.K. Rowling:");
        List<Book> rowlingBooks = bookService.searchByAuthor("J.K. Rowling");
        for (Book book : rowlingBooks) {
            System.out.println(book);
        }

        // --- Filter by Category ---
        System.out.println("\nFantasy Books:");
        List<Book> fantasyBooks = bookService.filterByCategory(Category.FANTASY);
        for (Book book : fantasyBooks) {
            System.out.println(book);
        }

        // --- Update User Profile ---
        User user = userService.findUserByEmail("alice.w@gmail.com");
        userService.updateProfile(user, "Alice", "Williams", 26, "alice.w@gmail.com");
        System.out.println("\nUpdated User Profile: " + user);
    }
}
