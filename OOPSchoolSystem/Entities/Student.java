package OOPSchoolSystem.Entities;

import java.util.List;

public class Student {
    public String id;
    public String name;
    public String grade;
    public Short age;
    public List<Subject> courses;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                ", courses=" + courses +
                '}';
    }
}
