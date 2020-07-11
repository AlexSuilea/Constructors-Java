package com.alexsuilea;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("12345", 100, "Default Name", "Default Email", "Default phoneNumber");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int funds){
        this.balance += funds;
        System.out.println();
        System.out.println("You have added: " +funds+ "$");
        System.out.println("Now your balance is: " +getBalance()+ "$");
        System.out.println();
    }

    public void withdrawFunds(double funds){
        if(funds > this.balance){
            System.out.println();
            System.out.println("Insufficient funds, your balance is: " +getBalance()+ "$");
        }
        else{
            this.balance -= funds;
            System.out.println();
            System.out.println("You have withdraw: "+funds+ "$");
            System.out.println("Now your balance is: " +getBalance()+ "$");
            System.out.println();
        }
    }
    public void display(){
        System.out.println("Name: "+getCustomerName()+ "\nAccount number: " +getAccountNumber() +
                "\nEmail: "+getEmail()+ "\nPhoneNumber: "+getPhoneNumber()+
                "\nBalance: "+getBalance()+ "$");
    }
}
