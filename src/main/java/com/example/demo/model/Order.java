package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="order_menu")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique=true, nullable = false)
    private Long id;
    private Long idPay;
    private Date date;
    private String comment;
    private String userName;
    private String mail;


    public Order(){

    }

    public Order(String mail, String userName, Long idPay, Date date, String comment) {
        this.mail = mail;
        this.userName = userName;
        this.idPay = idPay;
        this.date = date;
        this.comment = comment;
    }
    public Order(String mail, String userName, Date date, String comment) {
        this.mail = mail;
        this.userName = userName;
        this.date = date;
        this.comment = comment;
    }

    public Long getIdPay() {
        return idPay;
    }

    public void setIdPay(Long idPay) {
        this.idPay = idPay;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
