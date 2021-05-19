package com.example.demo.model;

import com.example.demo.TypeRole;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "building")

public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String creationDate;
    @Enumerated(EnumType.STRING)
    private TypeRole type;
    /*@ManyToOne
    @JsonIgnore
    private Address address;
    */

    public Building() {

    }
    public Building(String creationDate, TypeRole type) {
        this.creationDate = creationDate;
        this.type = type;
    }


    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public TypeRole getType() {
        return type;
    }

    public void setType(TypeRole type) {
        this.type = type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


}

