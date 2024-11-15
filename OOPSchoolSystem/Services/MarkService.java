package OOPSchoolSystem.Services;

import OOPSchoolSystem.Entities.Mark;
import OOPSchoolSystem.Entities.Student;
import OOPSchoolSystem.Entities.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarkService {
    static Scanner scanner = new Scanner(System.in);


    public static Mark addMark() {
        Mark mark = new Mark();
        System.out.println("Enter Test Name: ");
        mark.setTitle(scanner.nextLine());
        System.out.println("Enter mark");
        try {
            mark.setMarks(scanner.nextFloat());
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
        scanner.nextLine(); // This line you have to add (It consumes the \n character)
        System.out.println("Enter Grade");
        mark.setGrade(scanner.nextLine());
        System.out.println("Enter comments");
        mark.setComments(scanner.nextLine());
        return mark;
    }

    public static List<Mark> addMarks() {
        List<Mark> markList = new ArrayList<>();
        Boolean exitFlag = true;

        while (exitFlag) {
            System.out.println("Enter marks? Y/N");
            String newDataEntry = scanner.nextLine();
            if (newDataEntry.contains("Y") || newDataEntry.contains("y")) {
                markList.add(MarkService.addMark());
            } else if (newDataEntry.contains("N") || newDataEntry.contains("n")) {
                exitFlag = false;
            } else {
                System.out.println("Invalid input");
            }
        }
        return markList;
    }

    public static void calculateMarksAverage(List<Student> studentList) {
        System.out.println("Enter Student ID: ");
        String studentId = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getId().equals(studentId)) {
                for (Subject course : student.getCourses()) {
                    System.out.println("Enter course name: ");
                    String courseName = scanner.nextLine();
                    try {
                        if (course.getName().equals(courseName)) {
                            Float totalMarks = 0F;
                            for (Mark mark : course.getMarks()) {
                                totalMarks += mark.getMarks();
                            }
                            Float average = totalMarks / course.getMarks().size();

                            System.out.println("The average of marks is " + average);
                        } else {
                            System.out.println("Student does not exist");
                        }

                    } catch (Exception e) {
                        System.out.println("Invalid marks");
                    }
                }
            }
        }
    }
}
