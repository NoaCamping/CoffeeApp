package com.example.suitedcoffee.coffeeapp;

import java.lang.reflect.Constructor;

public class Product {
    private String name="";
    private double price=0.0;
    private int quantity=0;
    private double total_sum=0.0;
    private int discount=0;

    /**
     * Constructor
     */
    public Product(String name)
    {
        this.name=name;
    }

    /**
     * Constructor
     */
    public Product(String name, double price, int quantity)
    {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.total_sum=price*quantity;
    }

    /**
     * Constructor
     */
    public Product(String name, double price, int quantity, int discount)
    {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.total_sum=(1.0*(100-discount)*price*quantity)/100.0;
    }

    //Getters
    public String getName(){
        return name;
    }
    public int getQuantity(){return quantity;}
    public double getPrice(){return price;}
    public double getTotal(){return total_sum;}
    public int getDiscount(){return discount;}

    //Setters
    public void setName(String name){this.name=name;}
    public void setPrice(double price){this.price=price;}
    /**
     * Updating quantity of product and recalculates the total sum
     */
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
        if(discount==0)
            this.total_sum=price*quantity;
        else
            this.total_sum=(1.0*(100-discount)*price*quantity)/100.0;
    }

    public void setDiscount(int discount){this.discount=discount;}
}
