// Book.java
import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter for title (used for comparison during removal)
    public String getTitle() {
        return title;
    }

    // String representation of a book
    @Override
    public String toString() {
        return title + " by " + author + ", ISBN: " + isbn;
    }

    // Main method to demonstrate adding and removing books
    public static void main(String[] args) {
        // Create a list to store books
        ArrayList<Book> books = new ArrayList<>();

        // Add books
        books.add(new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630"));
        books.add(new Book("An Introduction to Python", "Guido van Rossum", "9355423489"));

        // Display list of books
        System.out.println("List of books:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Remove a book by title
        System.out.println("\nAfter removing The C Programming Language:");
        books.removeIf(book -> book.getTitle().equals("The C Programming Language"));

        // Display updated list of books
        System.out.println("List of books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
