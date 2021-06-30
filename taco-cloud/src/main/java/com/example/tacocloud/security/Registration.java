package com.example.tacocloud.security;

import com.example.tacocloud.domain.User;
import lombok.Data;

@Data
public class Registration {
    private String username;
    private String password;
    private String fullname;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;

    public User convertUser() {
        return new User(username, password, fullname, street, city, state, zip, phoneNumber);
    }
}
