package org.example.model;

import org.example.library.BookKeeping;
import org.example.library.BookRequest;

import java.util.Iterator;
import java.util.List;

public class LibraryUsers extends LibraryMembers {


    public LibraryUsers(String name, String position, String phoneNO) {
        super(name, position, phoneNO);
    }

    public void borrowRequest(String isbn) {
        List theCatalog = BookKeeping.getBookRecord();
        Iterator bookIterator = theCatalog.iterator();
        while (bookIterator.hasNext()) {
            List book = (List) bookIterator.next();
            if (book.get(0).equals(isbn)) {
                BookRequest bookRequest = new BookRequest(this.getPriorityLevel(), this.getName(), isbn);
                BookKeeping.updateQueue(bookRequest);
                BookKeeping.updatePrioritizedQueue(bookRequest);
                break;
            }
        }
    }

    public void returnBooks() {

    }
    @Override
    public void getUserInfo() {

    }


}
