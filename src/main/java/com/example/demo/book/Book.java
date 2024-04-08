package com.example.demo.book;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Book {
@Id
@SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
@GeneratedValue(

)

    private Long Id;
    private Long libraryId;
    private String title;
    private String description;
    private String authorName;
    private String cover;
    private LocalDate pubDate;
    
    public Book() {
    }

    public Book(Long id, Long libraryId, String title, String description, String authorName, String cover,
            LocalDate pubDate) {
        Id = id;
        this.libraryId = libraryId;
        this.title = title;
        this.description = description;
        this.authorName = authorName;
        this.cover = cover;
        this.pubDate = pubDate;
    }

    public Book(Long libraryId, String title, String description, String authorName, String cover, LocalDate pubDate) {
        this.libraryId = libraryId;
        this.title = title;
        this.description = description;
        this.authorName = authorName;
        this.cover = cover;
        this.pubDate = pubDate;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public LocalDate getPubDate() {
        return pubDate;
    }

    public void setPubDate(LocalDate pubDate) {
        this.pubDate = pubDate;
    }

    @Override
    public String toString() {
        return "Book [Id=" + Id + ", libraryId=" + libraryId + ", title=" + title + ", description=" + description
                + ", authorName=" + authorName + ", cover=" + cover + ", pubDate=" + pubDate + "]";
    }
    
 
    

}
