package OOPSchoolSystem.Entities;

import java.util.List;

public class Library {
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<Book> books;
    private String name;

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", name='" + name + '\'' +
                '}';
    }
}
