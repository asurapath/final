package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "main_1")
public class Main {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String type;
    private String color;
    private int size;

    public Main() {
    }

    public Main(String brand, String type, String color, int size) {
        this.id = id;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
