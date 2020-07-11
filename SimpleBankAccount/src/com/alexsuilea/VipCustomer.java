package com.alexsuilea;

import javax.script.ScriptEngine;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Default name", 1000, "something@gmail.com");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "default@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

        System.out.println("Name: " + getName() +
                "\nCredit Limit: " +getCreditLimit() + "$" +
                "\nEmail Address: " +getEmailAddress());
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
