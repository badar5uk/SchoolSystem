package OOPSchoolSystem.Entities;

import java.util.List;

public class Subject {
    private String name;

    public Short getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(Short creditHours) {
        this.creditHours = creditHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    private Short creditHours;
    private List<Mark> marks;

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", creditHours=" + creditHours +
                ", marks=" + marks +
                '}';
    }
}
