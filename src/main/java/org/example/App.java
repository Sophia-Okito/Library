package org.example;

import org.example.library.BookKeeping;
import org.example.library.Books;
import org.example.model.Librarian;
import org.example.model.LibraryUsers;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        BookKeeping bookKeeping = new BookKeeping();

        Librarian librarian = new Librarian("Sophia", "Librarian", "0908");

        LibraryUsers teacherJoy = new LibraryUsers("Joy", "Teacher", "0900");
        librarian.registerUsers(teacherJoy);

        LibraryUsers teacherJohn = new LibraryUsers("John", "Teacher", "0901");
        librarian.registerUsers(teacherJohn);

        LibraryUsers studentLove = new LibraryUsers("Love", "Student", "0902");
        librarian.registerUsers(studentLove);

        LibraryUsers studentJude = new LibraryUsers("Jude", "Student", "0903");
        librarian.registerUsers(studentJude);

        LibraryUsers pupilFaith = new LibraryUsers("Faith", "Pupil", "0903");
        librarian.registerUsers(pupilFaith);

        Books book = new Books("Extrusion Cooking", "9780128153604", "2020", 1);
        librarian.registerBooks(book);

        Books book1 = new Books("Reaching Net Zero", "9780128233665", "2020", 2);
        librarian.registerBooks(book1);

        Books book2 = new Books("Ethanol", "9780128114582", "2019", 1);
        librarian.registerBooks(book2);

        studentJude.searchBook("Year", "2020");



        bookKeeping.displayUsersRecord();
        bookKeeping.displayBookRecord();

        pupilFaith.borrowRequest("9780128114582");
        teacherJohn.borrowRequest("9780128114582");
        teacherJoy.borrowRequest("9780128114582");
        studentJude.borrowRequest("9780128114582");



        bookKeeping.displayRequestList();
        bookKeeping.displayPrioritizedRequestList();
        System.out.println( "Hello World!" );
    }
}
