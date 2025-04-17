package com.example.coffee_system;

//Inheritance - Different beverages "Coffee" from a super class Beverage
public class Coffee extends Beverage{

    public Coffee(double price){
        super("Coffee", price);
    }

    @Override
    public void prepare(){
        System.out.println("Brewing coffee beans and pouring into cup");
    }



}
