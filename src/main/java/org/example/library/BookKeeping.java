package org.example.library;

import java.util.*;

public class BookKeeping {

    private static Set userRecord;
    private static List bookRecord;
    private static Queue<BookRequest> prioritizedRequestList;
    private static Queue<BookRequest> bookRequestList;

    public BookKeeping() {
        userRecord = new HashSet();
        bookRecord = new ArrayList();
        bookRequestList = new LinkedList<>();
        prioritizedRequestList = new PriorityQueue<>();
    }

    public static void updateUsersRecord(List userList) {
        userRecord.add(userList);

    }

    public void displayUsersRecord() {
        System.out.println(userRecord.toString());

    }
    public static void updateBooksRecord(List bookList) {
        bookRecord.add(bookList);
    }

    public void displayBookRecord() {
        System.out.println(bookRecord.toString());

    }

    public void displayRequestList() {
        Iterator bookIterator = bookRequestList.iterator();

        while (bookIterator.hasNext()) {
            BookRequest request = (BookRequest) bookIterator.next();
            System.out.println(request.getBorrower() + " " + request.getIsbn() + " " + request.getPriorityLevel());
            System.out.println();
            }
        }

    public void displayPrioritizedRequestList() {
        Iterator bookIterator = prioritizedRequestList.iterator();

        while (bookIterator.hasNext()) {
            BookRequest request = (BookRequest) bookIterator.next();
            System.out.println(request.getBorrower() + " " + request.getIsbn() + " " + request.getPriorityLevel());
            System.out.println();
        }
    }

    public static void updateQueue(BookRequest request) {
        bookRequestList.add(request);
    }

    public static void updatePrioritizedQueue(BookRequest request) {
        prioritizedRequestList.add(request);

    }
    public void updateBorrowList() {

    }

    public static List getBookRecord() {
        return bookRecord;
    }

    public static Queue<BookRequest> getPrioritizedRequestList() {
        return prioritizedRequestList;
    }

    public static Queue<BookRequest> getBookRequestList() {
        return bookRequestList;
    }
}
