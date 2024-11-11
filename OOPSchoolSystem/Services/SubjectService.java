package OOPSchoolSystem.Services;

import OOPSchoolSystem.Entities.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubjectService {
    static Scanner scanner = new Scanner(System.in);

    public static Subject addSubject(Boolean isTeacher) {

        Subject subject = new Subject();
        System.out.println("Enter Subject Name: ");
        subject.name = scanner.nextLine();
        System.out.println("Enter Credit hours");
        try {
            subject.creditHours = scanner.nextShort();
        }catch (Exception e){
            System.out.println("Invalid input");
        }
        if(isTeacher == true){

        } else {
            subject.marks = MarkService.addMarks();
        }


        return subject;
    }

    public static List<Subject> addSubjects(Boolean isTeacher) {
        Boolean exitFlag = true;
        List<Subject> subjectsList = new ArrayList<>();
        while (exitFlag) {
            System.out.println("Enter Subject? Y/N");
            String newDataEntry = scanner.nextLine();
            if (newDataEntry.contains("Y") || newDataEntry.contains("y")) {
                subjectsList.add(SubjectService.addSubject(isTeacher));
            } else if (newDataEntry.contains("N") || newDataEntry.contains("n")) {
                exitFlag = false;
            } else {
                System.out.println("Invalid input");
            }
        }
        return subjectsList;
    }
}
