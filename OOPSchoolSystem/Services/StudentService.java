package OOPSchoolSystem.Services;

import OOPSchoolSystem.Entities.School;
import OOPSchoolSystem.Entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    static Scanner scanner = new Scanner(System.in);

    public static Student addStudent() {

        Student student = new Student();
        System.out.println("Enter student ID");
        student.setId(scanner.nextLine());
        System.out.println("Enter Student Name: ");
        student.setName(scanner.nextLine());
        System.out.println("Enter Student Age");
        try {
            student.setAge(scanner.nextShort());
        } catch (Exception e) {
            System.out.println("Invalid age");
        }
        scanner.nextLine();
        System.out.println("Enter Grade");
        student.setGrade(scanner.next());
        student.setCourses(SubjectService.addSubjects(false));
        return student;

    }

    public static List<Student> addStudents() {

        Boolean exitFlag = true;
        List<Student> studentsList = new ArrayList<>();
        while (exitFlag) {
            System.out.println("Enter student? Y/N");
            String newDataEntry = scanner.nextLine();
            if (newDataEntry.contains("Y") || newDataEntry.contains("y")) {
                studentsList.add(StudentService.addStudent());
            } else if(newDataEntry.contains("N") || newDataEntry.contains("n")){
                exitFlag = false;
            } else {
                System.out.println("Invalid input");
            }
        }
        return studentsList;
    }
    public static void retrieveStudent(List<School> schools) {
        System.out.println("Enter Student ID: ");
        String studentId = scanner.nextLine();
        for (School school : schools) {
            for (Student student : school.getStudents()) {
                if (student.getId().equals(studentId)) {
                    System.out.println(student);
                } else {
                    System.out.println("Student does not exist");
                }
            }
        }
    }
}
