package hw.ch01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BookShelfYearIterator implements Iterator<Book>{
    private List<Book> sortedBooks;
    private int index = 0;

    public BookShelfYearIterator(BookShelf bookShelf) {
        this.sortedBooks = new ArrayList<>();
        for (int i = 0; i < bookShelf.getLength(); i++) {
            sortedBooks.add(bookShelf.getBookAt(i));
        }
        // 연도가 높은 순으로 정렬 (내림차순)
        sortedBooks.sort(Comparator.comparing(Book::getYear, Comparator.reverseOrder()));  
    }

    @Override
    public boolean hasNext() {
        if (index < sortedBooks.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = sortedBooks.get(index);
        index++;
        return book;
    }

}
