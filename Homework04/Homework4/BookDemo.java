package Homework4;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Дюма", "Три мушкетера", 432, "123-345-567", true );

        System.out.println(book1);

        Book book2 = new Book ("Жуль Верн", "Дети капита Гранта");
        System.out.println(book2);

        bookUtil util = new bookUtil();

        util.editBookCatalogNumber("123-456-456", book2);
        util.editBookTotalNumberOfPages(567, book2);
        util.editBookIsInStorage(true, book2);
        System.out.println(book2);

        util.copyBook(book2);
        Book book3 = util.copyBook(book2);
        System.out.println(book3);
    }
}
