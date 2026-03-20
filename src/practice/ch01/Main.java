package practice.ch01;

import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        System.out.println("Book name: "+ book.getName());

        //책장 테스트
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("Java Programming"));
        bookShelf.appendBook(new Book("Python Programming"));
        bookShelf.appendBook(new Book("C++ Programming"));

        // 책꽂이에 직접 접근해서 꺼내는 방식

        System.out.println("Books in the bookshelf:");
        for (int i = 0; i < bookShelf.getLength(); i++) {
            Book b = bookShelf.getBookAt(i);
            System.out.println("Book name: " + b.getName());
        }

        // 반복자(Iterator)를 이용해서 책을 꺼내는 방식
        System.out.println("Books in the bookshelf (using Iterator):");
        Iterator<Book> it = bookShelf.iterator();
        while(it.hasNext()) {
            Book b = it.next();
            System.out.println("Book name: " + b.getName());
        }

        for(Book b: bookShelf){
            System.out.println("Book name: " + b.getName());
        }


    }
}