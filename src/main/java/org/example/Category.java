package org.example;

public class Category {
    private int cId;
    private String cName;

    public Category(int cId, String cName) {
        this.cId = cId;
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                '}';
    }
}
