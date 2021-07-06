package com.sun.algorithm.entity;


import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.List;

public class Product {

    @JSONField(name = "id")
    private int productId;

    private String name;

    private BigDecimal price;

    private List<User> usersList;

    private Double ghPrice;

    public Product(int id, String name, double price){
        this.productId = id;
        this.name = name;
        this.price = new BigDecimal(price);
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    public Double getGhPrice() {
        return ghPrice;
    }

    public void setGhPrice(Double ghPrice) {
        this.ghPrice = ghPrice;
    }
}
