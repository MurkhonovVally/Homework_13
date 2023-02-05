public class Main {
    public static void main(String[] args) {
        //Author - ссылка на класс Aurhot.java  author - имя
        //new Author - в классе автор firstName и lastName(В классе Main указываем нужные значения)
        Author author = new Author("Лев", "Гроссман");
        //Book - ссылка на класс Book.java  book - имя
        //new Book - в классе Book author title и publishingBook(В классе Main указываем нужные значения)
        Book book = new Book(author, "Волшебники", 2009);
        /*имя автора и год публикации можно указать в классах Author и Book,
        но лучше когда можно менять значения в одном классе
        */
        //soutf - вывод значений без лишних "" и +
        System.out.printf("%s, %s %s, %d%n", book.getTitle(),
                book.getAuthor().getFirstName(),
                book.getAuthor().getLastName(), book.getPublishingBook());
        //book.getTitle - имя переменной, .getTitle - вызов из Book.java т.к. в классе Main мы вводим значение для класса Book
        //set - setter метод который меняет значение(в данном случае дату издания книги)
        book.setPublishingBook(2023);
        System.out.println(book.getTitle() + ", " + author.getFirstName()
                + " " + author.getLastName() + ", " + book.getPublishingBook());
        System.out.println(author); //toString - вызов из Author
        System.out.println(book);   //toString - вызов из Book
        System.out.println(author.hashCode());//Имя Лев превращено в число
        System.out.println("author equals = " + author.equals(author));
        Author author1 = new Author("Lev", "Grossman");
        System.out.println("author equals = " + author.equals(author1));
        // сравнение двух авторов в классе Author через метод equals(Сравнение только имени и фамилии)
    }
}






/*
"toString" -Метод toString используется для приведения нашего объекта к строковому виду.
В нем мы должны вернуть строку в том формате, в котором хотим видеть наш объект в печати.
"equals" -Метод equals позволяет считать объекты равными, если совпадают те данные этих объектов, которые нужны.
"hashCode" -Метод hashCode выполняет функцию превращения объекта в число - кодировки.(Использовать хэшкод и иклс всегда вместе)
*/