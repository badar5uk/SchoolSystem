package OOPSchoolSystem.Entities;

import java.util.List;

public class Student {
    public String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isBlank() && !name.isEmpty()){
            this.name = name;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrade(){
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        if(age > 5 && age < 80){
            this.age = age;
        }
    }

    public List<Subject> getCourses() {
        return courses;
    }

    public void setCourses(List<Subject> courses) {
        this.courses = courses;
    }

    private String name;
    private String grade;
    private Short age;
    private List<Subject> courses;

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
