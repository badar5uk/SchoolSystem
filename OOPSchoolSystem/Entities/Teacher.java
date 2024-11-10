package OOPSchoolSystem.Entities;

import java.util.List;

public class Teacher {
    public String name;
    public String id;
    public Short yearsOfExperience;
    public List<Subject> subjectsExpertiseList;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", subjectsExpertiseList=" + subjectsExpertiseList +
                '}';
    }
}
