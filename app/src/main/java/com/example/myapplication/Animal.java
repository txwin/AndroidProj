package com.example.myapplication;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private String introduces;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", introduces='" + introduces + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduces() {
        return introduces;
    }

    public void setIntroduces(String introduces) {
        this.introduces = introduces;
    }
}
