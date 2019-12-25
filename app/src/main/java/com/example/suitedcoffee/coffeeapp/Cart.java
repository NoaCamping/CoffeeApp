package com.example.suitedcoffee.coffeeapp;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> p_list=new ArrayList<>();

    /**
     * Constructor - receives a list of products
     * @param list1
     */
    public Cart(ArrayList<Product> list1)
    {
        for(int i=0; i<list1.size(); i++)
            p_list.add(list1.get(i));

    }
}
