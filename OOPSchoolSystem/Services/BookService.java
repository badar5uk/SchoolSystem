package OOPSchoolSystem.Services;

import OOPSchoolSystem.Entities.Book;
import OOPSchoolSystem.Entities.School;
import OOPSchoolSystem.Entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    static Scanner scanner = new Scanner(System.in);
    static List<Book> bookList = new ArrayList<>();

    public static Book addBook(List<School> schools) {
        Boolean exitFlag = true;
        Book book = new Book();
        System.out.println("Enter book name");
        book.setName(scanner.nextLine());
        System.out.println("Enter Author's Name");
        book.setAuthor(scanner.nextLine());
        System.out.println("Enter year of publish");
        book.setYearOfPublishing(scanner.nextShort());
        scanner.nextLine();
        System.out.println("Enter Book ID");
        try {
            book.setId(scanner.nextInt());
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
        scanner.next();
        while (exitFlag) {
            System.out.println("Is the book Available? Y/N");
            String availableBook = scanner.nextLine();
            if (availableBook.contains("Y") || availableBook.contains("y")) {
                book.setAvailable(true);
                exitFlag = false;
            } else if (availableBook.contains("N") || availableBook.contains("n")) {
                book.setStudentName(assignBook(schools));
                book.setAvailable(false);
                exitFlag = false;
            } else {
                System.out.println("invalid input");
            }
        }
        return book;
    }

    public static List<Book> addBooks(List<School> schools) {
        Boolean exitFlag = true;
        while (exitFlag) {
            System.out.println("Enter books? Y/N ");
            String newDataEntry = scanner.nextLine();
            if (newDataEntry.contains("Y") || newDataEntry.contains("y")) {
                bookList.add(BookService.addBook(schools));
            } else if (newDataEntry.contains("N") || newDataEntry.contains("n")) {
                exitFlag = false;
            } else {
                System.out.println("Invalid input");
            }
        }
        return bookList;
    }

    public static void retrieveBook(List<School> schools) {
        System.out.println("Enter Book ID: ");
        Integer bookId = scanner.nextInt();
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                System.out.println(book);
            } else {
                System.out.println("Book does not exist");
            }
        }
    }

    public static String assignBook(List<School> schools) {
        if (schools.isEmpty()) {
            System.out.println("There is no student data to use");
            StudentService.addStudents();
        }
        System.out.println("Enter Student ID: ");
        String studentId = scanner.nextLine();
        for (School school : schools) {
            for (Student student : school.getStudents()) {
                if (student.getId().equals(studentId)) {
                    return studentId;
                } else {
                    System.out.println("Student does not exist");
                }
            }
        }
        return studentId;
    }
}
