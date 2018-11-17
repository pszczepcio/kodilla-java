package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfFor5Books(){
        //Given
        LibraryDatabase libraryDatabasemock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabasemock);
        List<Book> resultListOfBooks = generateListOfNBooks(10);
        LibraryUser user1 = new LibraryUser("Piotrek","Szczepanski","85051916111");
        when(libraryDatabasemock.listBooksWithCondition(anyString())).thenReturn(resultListOfBooks);

        List<Book> bookToRent2 = new ArrayList<Book>(); // List of books to order
        Book book1 = new Book("Title 1","Author 1",1971);
        Book book2 = new Book("Title 2","Author 2",1972);
        Book book3 = new Book("Title 3","Author 3",1973);
        Book book4 = new Book("Title 4","Author 4",1974);
        Book book5 = new Book("Title 5","Author 5",1975);
        //When
        bookToRent2.add(book1);
        bookToRent2.add(book2);
        bookToRent2.add(book3);
        bookToRent2.add(book4);
        bookToRent2.add(book5);
        bookLibrary.rentABook(user1,bookToRent2.get(0));
        bookLibrary.rentABook(user1,bookToRent2.get(1));
        bookLibrary.rentABook(user1,bookToRent2.get(2));
        bookLibrary.rentABook(user1,bookToRent2.get(3));
        bookLibrary.rentABook(user1,bookToRent2.get(4));


        //Then
        //Sprawdzam czy wybrana ksiażka może zostać wypożyczona
        Assert.assertTrue(bookLibrary.rentABook(user1,book1));
        Assert.assertTrue(bookLibrary.rentABook(user1,bookToRent2.get(1)));
        Assert.assertTrue(bookLibrary.rentABook(user1,bookToRent2.get(2)));
        Assert.assertTrue(bookLibrary.rentABook(user1,bookToRent2.get(3)));
        Assert.assertTrue(bookLibrary.rentABook(user1,bookToRent2.get(4)));

        //Sprawdzam czy użytkownik ma na koncie 5 książek
        Assert.assertEquals(5,bookLibrary.listBooksInHandsOf(user1).size());
    }

    @Test
    public void testListBooksInHandsOfFor1Books(){
        //Given
        LibraryDatabase libraryDatabasemock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabasemock);
        List<Book> resultListOfBooks = generateListOfNBooks(10);
        LibraryUser user1 = new LibraryUser("Piotrek","Szczepanski","85051916111");
        when(libraryDatabasemock.listBooksWithCondition(anyString())).thenReturn(resultListOfBooks);
        //When
        Book book1 = new Book("Title 1","Author 1",1971);
        //Then
        //Sprawdzam czy wybrana ksiażka może zostać wypożyczona
        Assert.assertTrue(bookLibrary.rentABook(user1,book1));

        //Sprawdzam czy użytkownik ma na koncie 5 książek
        Assert.assertEquals(1,bookLibrary.listBooksInHandsOf(user1).size());
    }

    @Test
    public void testListBooksInHandsOfFor0Books(){
        //Given
        LibraryDatabase libraryDatabasemock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabasemock);
        List<Book> resultListOfBooks = generateListOfNBooks(10);
        LibraryUser user1 = new LibraryUser("Piotrek","Szczepanski","85051916111");
        when(libraryDatabasemock.listBooksWithCondition(anyString())).thenReturn(resultListOfBooks);
        //When
        Book book1 = new Book();
        //Then
        //Sprawdzam czy wybrana ksiażka może zostać wypożyczona
        Assert.assertFalse(bookLibrary.rentABook(user1,book1));

        //Sprawdzam czy użytkownik ma na koncie 0 książek
        Assert.assertEquals(0,bookLibrary.listBooksInHandsOf(user1).size());
    }
}




