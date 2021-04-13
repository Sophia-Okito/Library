package org.example.model;

import org.example.library.BookKeeping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class LibraryMembers {
    protected String name;
    protected String position;
    protected String phoneNO;
    protected String libraryID;
    protected int priorityLevel;
    private  List searchList;


    public LibraryMembers(String name, String position, String phoneNO) {
        this.name = name;
        this.position = position;
        this.phoneNO = phoneNO;
        searchList = new ArrayList();
    }

    public void searchBook(String mood, String keyword) {
        List theCatalog = BookKeeping.getBookRecord();

        if (mood.equals("ISBN")) {
            Iterator bookIterator = theCatalog.iterator();

            while (bookIterator.hasNext()) {
                List book = (List) bookIterator.next();
                if (book.get(0).equals(keyword)) {
                    searchList.add(book);
                    System.out.println(searchList.toString());
                    break;
                }
            }
        } else if (mood.equals("Year")) {
            Iterator bookIterator = theCatalog.iterator();

            while (bookIterator.hasNext()) {
                List book = (List) bookIterator.next();
                if (book.get(2).equals(keyword)) {
                    searchList.add(book);
                }
            }
            System.out.println(searchList.toString());
        } else if (mood.equals("Title")) {
            Iterator bookIterator = theCatalog.iterator();

            while (bookIterator.hasNext()) {
                List book = (List) bookIterator.next();
                if (book.get(1).equals(keyword)) {
                    searchList.add(book);
                    System.out.println(searchList.toString());
                    break;
                }
            }
        } else {
            System.out.println("Wrong search mood inputted");
        }
    }


    public void setLibraryID(String libraryID) {
        this.libraryID = libraryID;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public abstract void getUserInfo();

    public String getName() {
        return name;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }
}
