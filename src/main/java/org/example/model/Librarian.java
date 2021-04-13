package org.example.model;

import org.example.library.BookKeeping;
import org.example.library.Books;

import java.util.ArrayList;
import java.util.List;

public class Librarian extends LibraryMembers {
    private List userInfoList;
    private List bookInfoList;

    public Librarian(String name, String position, String phoneNO) {
        super(name, position, phoneNO);
    }

    public void registerUsers(LibraryUsers libraryUsers) {
        userInfoList = new ArrayList();
        if (libraryUsers.position.equals("Teacher")) {
            libraryUsers.setPriorityLevel(0);
        }
        if (libraryUsers.position.equals("Student")) {
            libraryUsers.setPriorityLevel(1);
        }

        if (libraryUsers.position.equals("Pupil")) {
            libraryUsers.setPriorityLevel(2);
        }

        userInfoList.add(libraryUsers.name);
        userInfoList.add(libraryUsers.priorityLevel);

        BookKeeping.updateUsersRecord(userInfoList);
    }


    public void registerBooks(Books books) {
        bookInfoList = new ArrayList();
        bookInfoList.add(books.getISBN());
        bookInfoList.add(books.getTitle());
        bookInfoList.add(books.getPublishingYear());
        bookInfoList.add(books.getNoOfCopy());
        BookKeeping.updateBooksRecord(bookInfoList);

    }

    public void approveRequestOne() {

    }

    public void approveRequestTwo() {

    }

    @Override
    public void getUserInfo() {

    }
}
