package com.kodilla.patterns.singleton.library;

import com.kodilla.patterns.library.Book;
import com.kodilla.patterns.library.Library;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
   private Library library;

   @Test
    public void testToString() {
        library = new Library("Biblioteka1");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Book" + n, "author" + n, LocalDate.of(1999 + n, 1, 1 + n))));


        //    Płytkie klonowanie
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Biblioteka numer 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Głębokie klonowanie
        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblioteka numer 3");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        library.getBooks().stream()
                .map(e -> e.toString())
                .forEach(System.out::println);

        System.out.println();

        cloneLibrary.getBooks().stream()
                .map(e -> e.toString())
                .forEach(System.out::println);

        System.out.println();

        deepClonedLibrary.getBooks().stream()
                .map(e -> e.toString())
                .forEach(System.out::println);

        System.out.println();



        Assert.assertEquals(5 , library.getBooks().size());
        Assert.assertEquals("Biblioteka1" , library.getName());
        Assert.assertEquals(5 , cloneLibrary.getBooks().size());
        Assert.assertEquals("Biblioteka numer 2" , cloneLibrary.getName());
        Assert.assertEquals(5 , deepClonedLibrary.getBooks().size());
        Assert.assertEquals("Biblioteka numer 3" , deepClonedLibrary.getName());
    }
}
