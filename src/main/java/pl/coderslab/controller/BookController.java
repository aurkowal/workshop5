package pl.coderslab.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.classes.Book;
import pl.coderslab.classes.MockBookService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }


    private final MockBookService service;

    public BookController(MockBookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getBooks() {
        return service.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable("id") long id) {
        return service.getBook(id);
    }


    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book newBook = service.addBook(book);
        return ResponseEntity.created(URI.create("/books/" + newBook.getId())).body(newBook);

    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable("id") long id, @RequestBody Book book) {
        return service.update(id, book);
    }

    @DeleteMapping("/{id}")
    public 


}