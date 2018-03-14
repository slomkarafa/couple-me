package com.slomek.CoupleMe.user.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    @Getter
    private Long id;

    @Getter
    private String username;

    @Getter
    private String name;

    @Getter
    private String surname;

    private User() {
    }

    public User(String username, String name, String surname) {
        this.username = username;
        this.name = name;
        this.surname = surname;
    }


    public UserDto dto() {
        return UserDto.builder()
                .name(username)
                .surname(name)
                .id(id)
                .build();
    }

}
