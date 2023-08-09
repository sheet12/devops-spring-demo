package org.example;

public class Product {
    private int pId;
    private String pName;
    private Category category;

    public Product(int pId, String pName, Category category) {
        this.pId = pId;
        this.pName = pName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", category=" + category +
                '}';
    }

}
