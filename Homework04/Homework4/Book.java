package Homework4;

public class Book {
    String author;
    String bookName;
    int totalNumberOfPages;
    String catalogNumber;
    boolean isInStorage;

    public Book(String author, String bookName){
        this.author = author;
        this.bookName = bookName;
    }
    public Book(String author, String bookName, int totalNumberOfPages, String catalogNumber, boolean isInStorage){
        this.author = author;
        this.bookName = bookName;
        this.totalNumberOfPages = totalNumberOfPages;
        this.catalogNumber = catalogNumber;
        this.isInStorage= isInStorage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", totalNumberOfPages=" + totalNumberOfPages +
                ", catalogNumber='" + catalogNumber + '\'' +
                ", isInStorage=" + isInStorage +
                '}';
    }
}
