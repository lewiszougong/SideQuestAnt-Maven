package com.quiz;

public class Employees {
    private int id;
    private String name;
    private String days;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id='" + id + '\'' +
                ", Name='" + name + '\'' +
                ", Days='" + days + '\'' +
                '}';
    }
}
