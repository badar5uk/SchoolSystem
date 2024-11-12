package OOPSchoolSystem.Services;

import OOPSchoolSystem.Entities.Library;
import OOPSchoolSystem.Entities.School;

import java.util.List;
import java.util.Scanner;

public class LibraryService {
    static Scanner scanner = new Scanner(System.in);

    public static Library addLibrary(List<School> schools){
        Library library = new Library();
        System.out.println("Enter Library Name");
        library.setName(scanner.nextLine());
        library.setBooks(BookService.addBooks(schools));
        return library;
    }

}
