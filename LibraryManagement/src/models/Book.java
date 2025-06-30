package models;

public class Book {
    private static long counter = 1;
    private long bookId;
    private String bookTitle;
    private String authorName;
    private Category category;
    private int publishedYear;
    private int stocks;

    public Book(String bookTitle, String authorName, Category category, int publishedYear, int stocks) {
        this.bookId = counter++;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.category = category;
        this.publishedYear = publishedYear;
        this.stocks = stocks;
    }

    public long getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Category getCategory() {
        return category;
    }

    public int getPublishedYear() {
        return publishedYear;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }


    @Override
    public String toString() {
        return "Book{" +
                "ID=" + bookId +
                ", Title='" + bookTitle + '\'' +
                ", Author='" + authorName + '\'' +
                ", Category=" + category +
                ", Year=" + publishedYear +
                ", Stocks=" + stocks +
                '}';
    }
}
