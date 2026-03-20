package pl.coderslab.classes;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class MockBookService {
    private List<Book> list;
    private static Long nextId = 5L;

    public MockBookService() {
        list = new ArrayList<>();
        list.add(new Book( 2L, "9788324631766", "Thinking in Java", "Bruce	Eckel", "Helion", "programming"));
        list.add(new Book( 3L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        list.add(new Book( 4L,"9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
    }

    public Book addBook(Book book){
        long id = nextId;
        book.setId(id);
        list.add(book);
        nextId++;
        return book;
    }

    public List<Book> getBooks() {
        return Collections.unmodifiableList(list);

    }

    public Book getBook(long id) {
        for (Book book : list) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public void update() {

    }

    public void delete(){

    }

}
