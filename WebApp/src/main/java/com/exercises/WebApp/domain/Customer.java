package com.exercises.WebApp.domain;

import org.springframework.stereotype.Repository;


public class Customer {
    private String name;
    private String userType;
    private String role;

    public Customer(String name, String userType, String role) {
        this.name = name;
        this.userType = userType;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
