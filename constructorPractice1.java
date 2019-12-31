// Bank account class
public class BankAccount {
    private String customerName;
    private String email;
    private String phoneNumber;
    private int accountNumber;
    private double balance;
    public BankAccountC(String customerName,String email,String phoneNumber,int accountNumber,double balance){
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount){
        balance+=depositAmount;
        System.out.println("Deposit of "+depositAmount+" processed,new balance: "+balance);
    }
    public void withdraw(double withdrawAmount){
        if(withdrawAmount>balance)
            System.out.println("Process denied, not enough balance");
        else{
            balance-=withdrawAmount;
            System.out.println("Withdrawal of " +withdrawAmount+" processed,new balance: "+balance);
        }

    }
}


//Main class

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String customerName = in.nextLine();
        System.out.println("Enter your email: ");
        String email = in.nextLine();
        System.out.println("Enter your phone number: ");
        String phoneNumber = in.nextLine();
        System.out.println("Enter your account number: ");
        int accountNumber = in.nextInt();
        System.out.println("Enter balance: ");
        double balance = in.nextDouble();
        BankAccountC anonymousAccount = new BankAccountC(customerName,email,phoneNumber,accountNumber,balance);
        System.out.println("-----------------------Welcome to imaginary bank-----------------------");
        System.out.println("Your information");
        System.out.println("Name: " + anonymousAccount.getCustomerName());
        System.out.println("Email: " + anonymousAccount.getEmail());
        System.out.println("Phone no.: " + anonymousAccount.getPhoneNumber());
        System.out.println("Account no.: " + anonymousAccount.getAccountNumber());
        System.out.println("Balance: " + anonymousAccount.getBalance());
        System.out.println("Enter operation");
        System.out.println("1)Deposit\n2)Withdraw");
        int repeatProcess;
        int choice = in.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = in.nextDouble();
                    anonymousAccount.deposit(depositAmount);
                    System.out.println("1)Go back to menu\n2)Exit");
                    repeatProcess = in.nextInt();
                    if(repeatProcess==1) {
                        System.out.println("1)Deposit\n2)Withdraw");
                        choice = in.nextInt();
                    }
                    else {
                        System.out.println("Thank you for using our service");
                        System.exit(0);
                    }
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = in.nextDouble();
                    anonymousAccount.withdraw(withdrawAmount);
                    System.out.println("1)Go back to menu\n2)Exit");
                    repeatProcess = in.nextInt();
                    if(repeatProcess==1){
                        System.out.println("1)Deposit\n2)Withdraw");
                        choice = in.nextInt();
                    }
                    else {
                        System.out.println("Thank you for using our service");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
