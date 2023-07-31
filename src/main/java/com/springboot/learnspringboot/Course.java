package com.springboot.learnspringboot;

public class Course {
    private int id;
    private String name;
    private String author;

    //1.constructor
    public Course(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    //2. getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
    //3.toString

/*    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }*/
}
