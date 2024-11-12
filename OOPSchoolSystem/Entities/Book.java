package OOPSchoolSystem.Entities;


public class Book {
    private String name;
    private String author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        if (!name.isEmpty() && !name.isBlank()){
            this.name = name;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (!author.isEmpty() && !author.isBlank()){
            this.author = author;
        }
    }

    public Short getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(Short yearOfPublishing) {
        if (yearOfPublishing.toString().length() == 4){
            this.yearOfPublishing = yearOfPublishing;
        }
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    private Integer id;
    private Short yearOfPublishing;
    private Boolean isAvailable;

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
