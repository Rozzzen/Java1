package com.zhuk.domain.user;

import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    private int id;
    private String name;
    private String surname;
    private Gender gender;
    private String email;
    private String phone;
    private String password;
    private LocalDate bdate;
    private UserRole role;

    public User(String name, String surname, Gender gender, String email, String phone, String password, LocalDate bdate, UserRole role) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.bdate = bdate;
        this.role = role;
    }
}