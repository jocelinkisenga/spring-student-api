package com.example.demo.library;

import jakarta.persistence.*;
@Entity
public class Library {
    @Id

    @SequenceGenerator(name = "library_sequence", sequenceName = "library_sequence", allocationSize = 1)
    @GeneratedValue(

    )
    private Long Id;
    private Long userId;
    private String name;
    private String  adress;
    public Library() {
    }
    public Library(Long id, Long userId, String name, String adress) {
        Id = id;
        this.userId = userId;
        this.name = name;
        this.adress = adress;
    }

    public Library(Long userId, String name, String adress) {
        this.userId = userId;
        this.name = name;
        this.adress = adress;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Library [Id=" + Id + ", userId=" + userId + ", name=" + name + ", adress=" + adress + "]";
    }



}
