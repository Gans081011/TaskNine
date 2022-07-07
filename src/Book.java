import java.util.Objects;

public class Book {
    private String nameBook;
    private int yearPublication;
    private Author author;

    public Book(String nameBook, int yearPublication, Author author) {
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;
        this.author = author;
    }
    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }
    public Author getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearPublication, author);
    }

    @Override
    public String toString() {
        return nameBook  +" "+ yearPublication+" " + author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;


    }
}


