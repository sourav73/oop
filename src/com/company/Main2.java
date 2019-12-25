package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        BankAccount obj = new BankAccount();

        System.out.println("Enter your name: ");
        String name = in.nextLine();
        obj.setCustomerName(name);

        System.out.println("Enter your email address: ");
        String email = in.nextLine();
        obj.setEmail(email);

        System.out.println("Enter your phone number: ");
        int phoneNumber = in.nextInt();
        obj.setPhoneNumber(phoneNumber);

        System.out.println("Enter account number:");
        int accountNumber=in.nextInt();
        obj.setAccountNumber(accountNumber);

        System.out.println("Enter balance: ");
        double balance=in.nextDouble();
        obj.setBalance(balance);

        System.out.println("\n\nWelcome to imaginary bank:\n"+obj.getCustomerName()+"\n"+
                "Email: " + obj.getEmail()+"\nPhone no.: "+obj.getPhoneNumber() + "\nAccount no.: " +
                obj.getAccountNumber() + "\n" + "Balance: " + obj.getBalance());
        System.out.println("---------------------Choose operation---------------------");
        System.out.println("1)Deposit\n2)Withdraw");
        int choice = in.nextInt();
        double depositAmount,withdrawAmount;
        switch (choice){
            case 1:
                System.out.println("Enter deposit amount: ");
                depositAmount=in.nextDouble();
                obj.deposit(depositAmount);
                break;
            case 2:
                System.out.println("Enter withdrawal amount: ");
                withdrawAmount=in.nextDouble();
                obj.withdraw(withdrawAmount);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
