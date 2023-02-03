public class Main {
    public static void main(String[] args) {
        Author author = new Author("Лев", "Гроссман");
        Book book = new Book(author, "Волшебники", 2009);
        //soutf - вывод значений без лишних "" и +
        System.out.printf("%s, %s %s, %d%n", book.getTitle(),
                book.getAuthor().getFirstName(),
                book.getAuthor().getLastName(), book.getPublishingBook());
        //set - setter метод который меняет значение(в данном случае дату издания книги)
        book.setPublishingBook(2023);
        System.out.println(book.getTitle() + ", " + author.getFirstName()
                + " " + author.getLastName() + ", " + book.getPublishingBook());
    }
}
