package OOPSchoolSystem.Services;

import OOPSchoolSystem.Entities.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TeacherService {

    static Scanner scanner = new Scanner(System.in);
    static List<Teacher> teacherList = new ArrayList<>();

    public static Teacher addTeacher(){
        Teacher teacher = new Teacher();
        System.out.println("Enter Teacher's name: ");
        teacher.setName(scanner.nextLine());
        System.out.println("Enter ID: ");
        teacher.setId(scanner.nextLine());
        System.out.println("Enter Years of Experience: ");
        try {
            teacher.setYearsOfExperience(scanner.nextShort());
            scanner.nextLine();
        } catch (Exception e){
            System.out.println("Invalid Input");
        }
        teacher.setSubjectsExpertiseList(SubjectService.addSubjects(true));
        return teacher;
    }

    public static List<Teacher> addTeachers(){
        Boolean exitFlag = true;
        while (exitFlag) {
            System.out.println("Enter new Teacher? Y/N");
            String newDataEntry = scanner.nextLine();
            if (newDataEntry.contains("Y") || newDataEntry.contains("y")) {
                teacherList.add(TeacherService.addTeacher());
            } else if(newDataEntry.contains("N") || newDataEntry.contains("n")){
                exitFlag = false;
            } else {
                System.out.println("Invalid input");
            }
        }
        return teacherList;
    }

    public static void retrieveTeacher(){
        System.out.println("Enter Teacher's ID: ");
        String teacherId = scanner.nextLine();
        for(Teacher teacher : teacherList){
            if(teacher.getId().equals(teacherId)){
                System.out.println(teacher);
            }else {
                System.out.println("Teacher does not exist");
            }
        }
    }
}
