package pl.coderslab.classes;


public class Book {

    private long id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String type;

    public Book(){

    }
    public Book(long id, String isbn, String title, String author, String publisher, String type){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book = { id: " + this.id + ", isbn: " + this.isbn + ", title: " + this.title
                + ", author: " + this.author + ", publisher: " + this.publisher + ", type: " + this.type + " }";
    }
}
