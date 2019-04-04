package com.kodilla.patterns2.adapter.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics averageStatistics = new Statistics();
        return averageStatistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics medianstatistics = new Statistics();
        return medianstatistics.medianPublicationYear(books);
    }
}
