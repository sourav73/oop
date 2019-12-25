package com.company;

public class BankAccount {
    private String customerName;
    private String email;
    private int phoneNumber;
    private int accountNumber;
    private double balance;

    //Getters
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    //Setters
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }

    public double deposit(double depositAmount){
        balance+=depositAmount;
        System.out.println("Deposited amount: " + depositAmount);
        System.out.println("Total balance after deposit is: " + balance);
        return balance;
    }
    public double withdraw(double withdrawAmount){
        balance-=withdrawAmount;
        if(withdrawAmount>balance)
            System.out.println("Insufficient fund");
        else {
            System.out.println("Withdrawal amount: " + withdrawAmount);
            System.out.println("Total balance after withdraw is:" + balance);
        }
        return balance;
    }
}
