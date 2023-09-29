package org.example;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private String publishers;
    private String genre;
    private int numberOfPages;

    public Book() {
    }

    public Book(String title, String author, int yearOfPublication, String publishers, String genre, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.publishers = publishers;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getPublishers() {
        return publishers;
    }

    public void setPublishers(String publishers) {
        this.publishers = publishers;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public static Book inputBookData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author's Name: ");
        String author = scanner.nextLine();

        System.out.print("Enter Year of Publication: ");
        int yearOfPublication = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Title Publishers: ");
        String publishers = scanner.nextLine();

        System.out.print("Enter Book Genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter Number of Pages: ");
        int numberOfPages = scanner.nextInt();

        return new Book(title, author, yearOfPublication, publishers, genre, numberOfPages);
    }

    @Override
    public String toString() {
        String formatString = "%s | %s | %-6s | %-20s | %-20s | %-10s";
        return String.format(formatString, title, author, yearOfPublication, publishers, genre, numberOfPages);
    }
}
