package OOPSchoolSystem.Entities;

public class Mark {
    private Float marks;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Float getMarks() {
        return marks;
    }

    public void setMarks(Float marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String comments;
    private String grade;
    private String title;

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
