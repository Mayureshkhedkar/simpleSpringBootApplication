package com.example.simpleSpringBootApplication.model;
import org.springframework.stereotype.Component;
@Component
public class Products {
    private int prodId;
    private String prodName;
    private int price;
    public Products() {
    }
    public Products(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.price = price;
        this.prodName = prodName;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    @Override
    public String toString() {
        return " Products{" +
                "\tprodId=" + prodId +
                ", \tprodName='" + prodName + '\'' +
                ", \tprice=" + price +
                '}';
    }
}
