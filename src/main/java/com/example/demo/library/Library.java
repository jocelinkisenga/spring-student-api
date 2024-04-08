package com.example.demo.library;


import jakarta.persistence.*;

@Entity
public class Library {
    @Id

    @SequenceGenerator(name = "library_sequence", sequenceName = "library_sequence", allocationSize = 1)
    @GeneratedValue(

    )

    private Long Id;
    private String name;
    private String  adress;
    
    public Library() {
    }

    public Library(Long id, String name, String adress) {
        Id = id;
        this.name = name;
        this.adress = adress;
    }

    public Library(String name, String adress) {
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

    @Override
    public String toString() {
        return "Library [Id=" + Id + ", name=" + name + ", adress=" + adress + "]";
    }

    

}
