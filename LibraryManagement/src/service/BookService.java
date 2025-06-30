package service;


import models.Book;
import models.Category;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookService {
    private List<Book> books = new ArrayList<>();

    // Add a new book
    public void addBook(String title, String author, Category category, int publishedYear, int stocks) {
        Book book = new Book(title, author, category, publishedYear, stocks);
        books.add(book);
    }

    // Delete a book
    public void deleteBook(Book book) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(book)) {
                iterator.remove();
                return;
            }
        }
        throw new RuntimeException("Book not found...");
    }

    // Update book stock
    public void updateStock(Book book, int newStock) {
        book.setStocks(newStock);
    }

    // Get book details
    public void getBookDetails(Book book) {
        if (books.contains(book)) {
            System.out.println(book);
            return;
        }
        throw new RuntimeException("Book not found...");
    }

    // Search by title
    public List<Book> searchByTitle(String title) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookTitle().equalsIgnoreCase(title)) {
                results.add(book);
            }
        }
        return results;
    }

    // Search by author
    public List<Book> searchByAuthor(String author) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthorName().equalsIgnoreCase(author)) {
                results.add(book);
            }
        }
        return results;
    }

    // Filter by category
    public List<Book> filterByCategory(Category category) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getCategory() == category) {
                results.add(book);
            }
        }
        return results;
    }

    // Get all books
    public List<Book> getAllBooks() {
        return books;
    }

    // Issue a book (reduce stock by 1)
    public void issueBook(Book book) {
        if (book.getStocks() > 0) {
            book.setStocks(book.getStocks() - 1);
        } else {
            throw new RuntimeException("Book out of stock!");
        }
    }

    // Return a book (increase stock by 1)
    public void returnBook(Book book) {
        book.setStocks(book.getStocks() + 1);
    }
}
