package OOPSchoolSystem.Services;

import OOPSchoolSystem.Entities.Library;

import java.util.Scanner;

public class LibraryService {
    static Scanner scanner = new Scanner(System.in);

    public static Library addLibrary(){
        Library library = new Library();
        System.out.println("Enter Library Name");
        library.setName(scanner.nextLine());
        library.setBooks(BookService.addBooks());
        return library;
    }

}
