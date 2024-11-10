package OOPSchoolSystem.Entities;

public class Mark {
    public Float marks;
    public String comments;
    public String grade;
    public String title;

    @Override
    public String toString() {
        return "Mark{" +
                "marks=" + marks +
                ", comments='" + comments + '\'' +
                ", grade='" + grade + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
