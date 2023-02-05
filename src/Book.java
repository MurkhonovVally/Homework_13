public class Book {
    private final Author author;
    private final String title;
    private int publishingBook;

    public Book(Author author, String title, int publishingBook) {
        this.author = author;
        this.title = title;
        this.publishingBook = publishingBook;
    }

    //getter
    public Author getAuthor() {
        return author;
    }
    //getter
    public String getTitle() {
        return title;
    }
    //getter
    public int getPublishingBook() {
        return publishingBook;
    }
    //setter-(только на дату т.к. нет private)
    public void setPublishingBook(int publishingBook) {
        this.publishingBook = publishingBook;
    }

    public String toString() {
        return "книга: " + this.title + " год издания: " + this.publishingBook;
    }
}
