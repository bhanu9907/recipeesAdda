package com.example.recipeesadda;

import android.content.Context;

public class Product {
    private int id;
    private String Name;
    private String surname;
    private String age;
    private String username;
    private String password;
    Context context;

    public Product(int id, String name, String surname, String age, String username, String password, Context context) {
        this.id = id;
        Name = name;
        this.surname = surname;
        this.age = age;
        this.username = username;
        this.password = password;
        this.context = context;
    }

    public int getId()   {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
