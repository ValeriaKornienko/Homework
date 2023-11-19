package Homework4;

public class bookUtil {
    public void editBookCatalogNumber(String catalogNumber, Book book){
        book.catalogNumber = catalogNumber;
    }

    public void editBookTotalNumberOfPages(int totalNumberOfPages, Book book){
        book.totalNumberOfPages = totalNumberOfPages;

    }
    public void editBookIsInStorage(boolean isInStorage, Book book){
        book.isInStorage = isInStorage;
    }
    public Book copyBook(Book book){
        Book copyBook = new Book(book.author, book.bookName + " (copy)", book.totalNumberOfPages, book.catalogNumber, book.isInStorage);
        return copyBook;
    }
}
