package OOPSchoolSystem.Services;

import OOPSchoolSystem.Entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuService {

    static Scanner scanner = new Scanner(System.in);

    public static void menuSelection() {
        Boolean exitFlag = true;
        while (exitFlag) {
            System.out.println("Pick an Option: " +
                    "\n" + "1. Student Menu" +
                    "\n" + "2. Teacher Menu" +
                    "\n" + "3. Book Menu" +
                    "\n" + "4. Library Menu" +
                    "\n" + "5. Exit");
            String MainMenuInput = scanner.nextLine();
            if (MainMenuInput.equals("1")) {
                studentMenu();
            } else if (MainMenuInput.equals("2")) {
                teacherMenu();
            } else if (MainMenuInput.equals("3")) {
                bookMenu();
            } else if (MainMenuInput.equals("4")) {
                libraryMenu();
            } else if (MainMenuInput.equals("5")) {
                exitFlag = false;
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    public static void studentMenu() {
        List<Student> studentList = new ArrayList<>();
        while (true) {
            System.out.println("Pick an Option: " +
                    "\n" + "1. Enter Student Data" +
                    "\n" + "2. Get student Data" +
                    "\n" + "3. Get average for student" +
                    "\n" + "4. Return to Main Menu");
            String studentMenuInput = scanner.nextLine();
            if (studentMenuInput.equals("1")) {
                studentList = StudentService.addStudents();
            } else if (studentMenuInput.equals("2")) {
                StudentService.retrieveStudent(studentList);
            } else if (studentMenuInput.equals("3")) {
                MarkService.calculateMarksAverage(studentList);
            } else if (studentMenuInput.equals("4")) {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }
    public static void teacherMenu(){
        while (true) {
            System.out.println("Pick an Option: " +
                    "\n" + "1. Enter Teacher's Data" +
                    "\n" + "2. Get Teacher's data" +
                    "\n" + "3. Return to Main Menu");
            String teacherMenuInput = scanner.nextLine();
            if (teacherMenuInput.equals("1")) {
                TeacherService.addTeachers();
            } else if (teacherMenuInput.equals("2")) {
                TeacherService.retrieveTeacher();
            } else if (teacherMenuInput.equals("3")) {
                break;
            }
        }
    }
    public static void bookMenu(){
        while (true) {
            System.out.println("Pick an Option: " +
                    "\n" + "1. Enter Book Data" +
                    "\n" + "2. Get Book data" +
                    "\n" + "3. Return to Main Menu");
            String bookMenuInput = scanner.nextLine();
            if (bookMenuInput.equals("1")) {
                BookService.addBooks();
            } else if (bookMenuInput.equals("2")) {
                BookService.retrieveBook();
            } else if (bookMenuInput.equals("3")) {
                break;
            }
        }
    }
    public static void libraryMenu(){
        while (true) {
            System.out.println("Pick an Option: " +
                    "\n" + "1. Enter Library data" +
                    "\n" + "2. Book Menu" +
                    "\n" + "3. Return to Main Menu");
            String libraryMenuInput = scanner.nextLine();
            if (libraryMenuInput.equals("1")) {
                LibraryService.addLibrary();
            } else if (libraryMenuInput.equals("2")) {
                bookMenu();
            } else if (libraryMenuInput.equals("3")) {
                break;
            }
        }
    }
}
