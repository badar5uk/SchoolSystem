package OOPSchoolSystem.Services;

import OOPSchoolSystem.Entities.School;
import OOPSchoolSystem.Entities.Student;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolService {

    static Scanner scanner = new Scanner(System.in);
    static List<School> schools = new ArrayList<>();

    public static School addSchool() {

        School school = new School();
        System.out.println("Enter School Name");
        school.setName(scanner.nextLine());

        System.out.println("Enter School Address");
        school.setAddress(scanner.nextLine());
        school.setStudents(StudentService.addStudents());
        school.setTeachers(TeacherService.addTeachers());
        school.setLibrary(LibraryService.addLibrary(schools));

        return school;
    }

    public static List<School> addSchools() {
        Boolean exitFlag = true;

        while (exitFlag) {
            System.out.println("Enter  new school? Y/N");
            String newDataEntry = scanner.nextLine();
            if (newDataEntry.contains("Y") || newDataEntry.contains("y")) {
                schools.add(SchoolService.addSchool());
            } else if(newDataEntry.contains("N") || newDataEntry.contains("n")){
                exitFlag = false;
            } else {
                System.out.println("Invalid input");
            }
        }
        return schools;
    }
    public static void retrieveSchoolData(List<School> schoolList){
        System.out.println("Enter School name: ");
        String schoolName = scanner.nextLine();
        for(School school : schoolList){
            if(school.getName().equals(schoolName)){
                System.out.println(school);
            }else {
                System.out.println("School does not exist");
            }
        }
    }
}