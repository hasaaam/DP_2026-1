package practice.ch01;

public class Main{
    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        System.out.println("Book name: "+ book.getName());

        //책장 테스트
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("Java Programming"));
        bookShelf.appendBook(new Book("Python Programming"));
        bookShelf.appendBook(new Book("C++ Programming"));

        System.out.println("Books in the bookshelf:");
        for (int i = 0; i < bookShelf.getLength(); i++) {
            Book b = bookShelf.getBookAt(i);
            System.out.println("Book name: " + b.getName());
        }
    }
}