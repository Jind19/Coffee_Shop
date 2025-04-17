package com.example.coffee_system;

//Inheritance - Different beverages "Tea" from a super class Beverage
public class Tea extends Beverage{

    public Tea(double price){
        super("Tea", price);
    }

    @Override
    public void prepare(){
        System.out.println("Steeping tea bag in hot water");
    }
}
