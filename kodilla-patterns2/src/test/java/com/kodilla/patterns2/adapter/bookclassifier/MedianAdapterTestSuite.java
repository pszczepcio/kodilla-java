package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.adapter.bookclasifier.MedianaAdapter;
import com.kodilla.patterns2.adapter.adapter.bookclasifier.librarya.Book;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianaAdapter medianaAdapter = new MedianaAdapter();
        Book bezDachu = new Book("Aleksander Topolski", "Bez dachu", 2000, "1");
        Book instalacjeElektryczne = new Book("Mirosław Parol", "Instalacje elektryczne", 2001, "2");
        Book hobbit = new Book("Tolkien", "Hobbit", 1995, "3");
        Book nedznicy = new Book("Victor Hugo", "Nędznicy", 2005, "4");
        Book panTadeusz = new Book("Adam Mickiewicz", "Pan Tadeusz", 1986, "5");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(bezDachu);
        bookSet.add(instalacjeElektryczne);
        bookSet.add(hobbit);
        bookSet.add(nedznicy);
        bookSet.add(panTadeusz);

        //When
        int median = medianaAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2000, median);
    }
}
