package com.first;

import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}

class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, String ISBN, double fileSize) {
        super(title, author, ISBN);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("File Size: " + fileSize + " MB");
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();
  
    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks() {
        for (Book book : books) {
            book.displayDetails();
            System.out.println();
        }
    }

    public void findBooksByAuthor(String authorName) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(authorName)) {
                book.displayDetails();
                System.out.println();
            }
        }
    }

    public void removeBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                books.remove(book);
                System.out.println("Book with ISBN " + isbn + " removed from the library.");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found in the library.");
    }
}

public class librarysystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("RichDadPoorDad", "Robert", "9780446677455");
        Book book2 = new Book("The Gun", "Faren", "7890669712");
        EBook ebook1 = new EBook("InheritBook", "InheritAuthor", "3456733668", 29.5);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(ebook1);

        System.out.println("All Books in the Library:");
        library.displayAllBooks();

        System.out.println("Books by Author 'PolyAuthor 1':");
        library.findBooksByAuthor("Author 1");

        library.removeBookByISBN("7890669712");
        library.displayAllBooks();
    }
}