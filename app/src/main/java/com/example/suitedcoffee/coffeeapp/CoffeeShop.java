package com.example.suitedcoffee.coffeeapp;

public class CoffeeShop {
    private String business_name="";
    private String address="";
    private String city="";
    private String phone_number="";
    private String email="";
    private String manager="";

    //Constructor
    public CoffeeShop(String manager,String b_name,String address,String phone_number,
    String city, String email)
    {
        this.manager=manager;
        business_name=b_name;
        this.address=address;
        this.city=city;
        this.phone_number=phone_number;
        this.email=email;
    }

    //Constructor without email
    public CoffeeShop(String manager,String b_name,String address,String phone_number,
                      String city)
    {
        this.manager=manager;
        business_name=b_name;
        this.address=address;
        this.city=city;
        this.phone_number=phone_number;
    }
    //Constructor just company name, manager name and phone number
    public CoffeeShop(String b_name,String manager,String phone_number)
    {
        business_name=b_name;
        this.manager=manager;
        this.phone_number=phone_number;
    }

    //Getters

    public String getAddress() {
        return address;
    }

    public String getBusiness_name() {
        return business_name;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String getManager() {
        return manager;
    }

    public String getPhone_number() {
        return phone_number;
    }

    //setters


    public void setAddress(String address) {
        this.address = address;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
