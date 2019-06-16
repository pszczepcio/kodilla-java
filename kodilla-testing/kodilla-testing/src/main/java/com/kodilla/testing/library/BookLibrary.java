package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookLibrary {
    LibraryDatabase libraryDatabase;
    private HashMap<Book,LibraryUser> theUserListOfBooks = new HashMap<Book,LibraryUser>();

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){
        List<Book> userBooks = new ArrayList<Book>();
        for(Map.Entry<Book,LibraryUser> entry: theUserListOfBooks.entrySet()) {
            if(libraryUser == entry.getValue()) {
                userBooks.add(entry.getKey());
            }
        }
        return userBooks;
    }

    public boolean rentABook(LibraryUser libraryUser, Book book){
        List<Book> selectionList = new ArrayList<Book>();
        selectionList = libraryDatabase.listBooksWithCondition(book.getTitle());
        if(selectionList.contains(book)){
            theUserListOfBooks.put(book,libraryUser);
            return true;
        }
        return false;

    }

    int returnBooks(LibraryUser libraryUser){
        return 0;
    }
}
