package com.example.coffee_system;


//Encapsulation - Protecting the internal state of a beverage
public class Beverage{
    //Fields
    private String name;
    private double price;

    //Constructor

    public Beverage() {
    }

    public Beverage(String name, double price) {
        this.name = name;
        if(price > 0){
            this.price = price;
        } else {
            this.price = 2.0;
            System.out.println("Price cannot be negative or zero");
        }
    }

    //Static Factory Method
    public static Beverage createBeverage(String name, double price){
        //Validaion logic right here in the factory - ensures safety and readability
        if(price > 0){
            return new Beverage(name, price); //Good encapsulation : using constructor to ensure complete, valid object
        } else {
            System.out.println("Invalid price. Setting to default 2.0");
            return new Beverage(name, 2.0); //Fallback logic handled explicitly - safe default
        }
    }

    //Public getters (controlled access)

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    //Setter with validation (example of control)

    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        } else {
            this.price = 2.0;
            System.out.println("Price cannot be negative or zero");
        }
    }

    public void prepare(){
        System.out.println("Preparing a beverage...");
    }

}
