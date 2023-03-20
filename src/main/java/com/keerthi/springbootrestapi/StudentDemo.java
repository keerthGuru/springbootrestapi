package com.keerthi.springbootrestapi;

public class StudentDemo {
    int id;
    String name;

    public StudentDemo(int id, String name) {
        this.id = id;
        this.name =  name;
    }

     public String toString() {
    return id+ " - " +name;
    }

}
