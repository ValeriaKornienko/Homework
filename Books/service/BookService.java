package service;
import entiry.*;
public class BookService {

    public void addBookToStore(Book[] store, Book aBook){
        int position = findFreePlace(store);
        if(-1 == position)

        store[position] = aBook;

    }
    private int findFreePlace(Book[]store){
        for (int i = 0; i < store.length; i++){
            if(store[i] == null)
                return i;
        }
        return -1;

    }

    public Book createBook(int id, String author, String bookName){
        Book newBook = new Book( 1, "Bel", "Example");
        return newBook;
    }

}
