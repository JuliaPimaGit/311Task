package com.example.Task.model;

import javax.persistence.*;

@Entity
@Table(name="userTable")
public class User{

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int size;

    @Column
    private String brand;

    public User(String name, int size, String brand) {
        this.name = name;
        this.size = size;
        this.brand = brand;
    }

    public User() {
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
