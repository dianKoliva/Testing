package com.example.classbjunit.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {

    @SequenceGenerator(
            name = "cart_sequence",
            sequenceName = "cart_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "cart_sequence",
            strategy = GenerationType.SEQUENCE)

    @Id
    private Long id;

    @ManyToMany
    private  List<Item> its ;
    private int totalPrice;
    private  int totalNumber;

    public Cart() {
    }

    public Cart(Long id, List<Item> its, int totalPrice, int totalNumber) {
        this.id = id;
        this.its = its;
        this.totalPrice = totalPrice;
        this.totalNumber = totalNumber;
    }

    public Cart(  int totalPrice, int totalNumber) {
        this.totalPrice = totalPrice;
        this.totalNumber = totalNumber;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getIts() {
        return its;
    }

    public void setIts(List<Item> its) {
        this.its = its;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }
}
