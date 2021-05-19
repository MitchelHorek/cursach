package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "type_menu")
public class TypeMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;
    private String rusName;






    public TypeMenu(){

    }
    public TypeMenu(String name) {
        this.name = name;
    }


    public String getRusName() {
        return rusName;
    }

    public void setRusName(String rusName) {
        this.rusName = rusName;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
