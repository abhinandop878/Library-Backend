package com.nestDigital.libraryBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class LibraryModel {
    @Id
    @GeneratedValue
    private int id;
    private String bookTitle;
    private String authorName;
    private int isbn;
    private String authorEmail;
    private String bookSummary;
    private String publisher;
    private int pageCount;
    private String dateOfPublisher;
    private String language;
    private String publicationCountry;
    private int edition;

    public LibraryModel() {
    }

    public LibraryModel(int id, String bookTitle, String authorName, int isbn, String authorEmail, String bookSummary, String publisher, int pageCount, String dateOfPublisher, String language, String publicationCountry, int edition) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.isbn = isbn;
        this.authorEmail = authorEmail;
        this.bookSummary = bookSummary;
        this.publisher = publisher;
        this.pageCount = pageCount;
        this.dateOfPublisher = dateOfPublisher;
        this.language = language;
        this.publicationCountry = publicationCountry;
        this.edition = edition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getBookSummary() {
        return bookSummary;
    }

    public void setBookSummary(String bookSummary) {
        this.bookSummary = bookSummary;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getDateOfPublisher() {
        return dateOfPublisher;
    }

    public void setDateOfPublisher(String dateOfPublisher) {
        this.dateOfPublisher = dateOfPublisher;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublicationCountry() {
        return publicationCountry;
    }

    public void setPublicationCountry(String publicationCountry) {
        this.publicationCountry = publicationCountry;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}
