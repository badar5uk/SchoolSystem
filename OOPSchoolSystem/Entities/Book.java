package OOPSchoolSystem.Entities;


public class Book {
    public String name;
    public String author;
    public Integer id;
    public String yearOfPublishing;
    public Boolean isAvailable;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", id=" + id +
                ", yearOfPublishing='" + yearOfPublishing + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
