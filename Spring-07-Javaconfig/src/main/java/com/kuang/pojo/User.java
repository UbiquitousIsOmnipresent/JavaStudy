package com.kuang.pojo;


import org.springframework.beans.factory.annotation.Value;

public class User {

    private String name;

    public User(){

    }

    public String getName() {
        return name;
    }
    @Value("老八")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
