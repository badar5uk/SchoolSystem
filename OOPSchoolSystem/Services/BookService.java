package OOPSchoolSystem.Services;

import OOPSchoolSystem.Entities.Book;
import OOPSchoolSystem.Entities.Mark;
import OOPSchoolSystem.Entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    static Scanner scanner = new Scanner(System.in);
    static List<Book> bookList = new ArrayList<>();

    public static Book addBook(){
        Boolean exitFlag = true;
        Book book = new Book();
        System.out.println("Enter book name");
        book.name = scanner.nextLine();
        System.out.println("Enter Author's Name");
        book.author = scanner.nextLine();
        System.out.println("Enter year of publish");
        book.yearOfPublishing = scanner.nextLine();
        System.out.println("Enter Book ID");
        book.id = scanner.nextInt();
        while (exitFlag) {
            System.out.println("Is the book Available? Y/N");
            String availableBook = scanner.nextLine();
            if (availableBook.contains("Y") || availableBook.contains("y")) {
                book.isAvailable = true;
                exitFlag = false;
            } else if (availableBook.contains("N") || availableBook.contains("n")) {
                book.isAvailable = false;
                exitFlag = false;
            } else {
                System.out.println("invalid input");
            }
        }
        return book;
    }

    public static List<Book> addBooks(){
        Boolean exitFlag = true;
        while (exitFlag) {
            System.out.println("Enter more books? Y/N ");
            String newDataEntry = scanner.nextLine();
            scanner.nextLine();
            if (newDataEntry.contains("Y") || newDataEntry.contains("y")) {
                bookList.add(BookService.addBook());
            } else if(newDataEntry.contains("N") || newDataEntry.contains("n")){
                exitFlag = false;
            } else {
                System.out.println("Invalid input");
            }
        }
        return bookList;
    }
    public static void retrieveBook(){
        System.out.println("Enter Book ID: ");
        Integer bookId = scanner.nextInt();
        for(Book book : bookList){
            if(book.id.equals(bookId)){
                System.out.println(book);
            }else {
                System.out.println("Book does not exist");
            }
        }
    }
}
