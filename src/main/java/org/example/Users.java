package org.example;

public class Users {
    private int id;
    private String name;

    public Users(int id, String name) {
        System.out.println("constructor called");
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
