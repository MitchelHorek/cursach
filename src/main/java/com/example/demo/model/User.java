package com.example.demo.model;

import com.example.demo.TypeRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Table(name="user_cafe")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//аннотация для автоматич генерации поля
    @Column(name = "id")
    private Long id;
    @Enumerated(EnumType.STRING)
    private TypeRole role;
    private Long phone;
    private String mail;
    private String familia;
    private String name;
    private String otchestvo;
    private String login;
    private String password;

    public User(){

    }
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public User(TypeRole role, Long phone, String mail, String familia, String name, String otchestvo, String login, String password) {
        this.role = role;
        this.phone = phone;
        this.mail = mail;
        this.familia = familia;
        this.name = name;
        this.otchestvo = otchestvo;
        this.login = login;
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority(role.name()));//все являются юзерами
    }

    public boolean isManager(){
        System.out.println(role);
        return role == TypeRole.manager;
    }
    public TypeRole getRole() {
        return role;
    }

    public void setRole(TypeRole role) {
        this.role = role;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }



    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
