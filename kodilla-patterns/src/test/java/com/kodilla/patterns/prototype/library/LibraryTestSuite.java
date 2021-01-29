package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //given
        Book book1 = new Book("Czarno na bialym", "Joanna Jedrzejczyk", LocalDate.of(2020, 05,21));
        Book book2 = new Book("Powrot", "Nicholas Sparks", LocalDate.of(2019, 07,21));
        Book book3 = new Book("Sezon drugi", "Max Czornyj", LocalDate.of(2018, 02,11));
        Library library = new Library("First Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Second Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary. setName("Third library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library.getBooks().remove(book3);

        //then
        System.out.println(library.getBooks());
        assertEquals(2, library.getBooks().size());
        System.out.println(clonedLibrary.getBooks());
        assertEquals(2, clonedLibrary.getBooks().size());
        System.out.println(deepClonedLibrary.getBooks());
        assertEquals(3, deepClonedLibrary.getBooks().size());

    }

}
