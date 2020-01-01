// Vip Customer class
public class VipCustomer {
    private String customerName;
    private String customerEmail;
    private double creditLimit;

    public VipCustomer(){
        this("Bob brown","bob@email.com",50000);
    }

    public VipCustomer(String customerName,String customerEmail){
        this(customerName,customerEmail,50000);
        this.customerName=customerName;
        this.customerEmail=customerEmail;
    }

    public VipCustomer(String customerName,String customerEmil,double creditLimit){
        this.customerName=customerName;
        this.customerEmail=customerEmil;
        this.creditLimit=creditLimit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}

//Main class

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("-----------Welcome to Imaginary bank-----------");
        System.out.println("Sample fixed credit package:");
        VipCustomer bob = new VipCustomer();
        System.out.println(bob.getCustomerName()+"\n"+bob.getCustomerEmail()+
                "\n"+bob.getCreditLimit()+"\n");
        System.out.println("Enter your choice");
        System.out.println("1)Fixed credit(15.0 credit)\n2)Custom credit");
        int choice=in.nextInt();
        in.nextLine();
        String customerName;
        String customerEmail;
        double credit;
        switch (choice){
            case 1:
                System.out.println("Enter your name:");
                customerName = in.nextLine();
                System.out.println("Enter your email address:");
                customerEmail = in.nextLine();
                VipCustomer fixedCredit = new VipCustomer(customerName,customerEmail);
                System.out.println("\nYour package info:\n"+"Name: "+fixedCredit.getCustomerName()+"\n"+
                        "Email: "+fixedCredit.getCustomerEmail()+"\n"+"Credit: "+fixedCredit.getCreditLimit());
                break;
            case 2:
                System.out.println("Enter your name:");
                customerName = in.nextLine();
                System.out.println("Enter your email address:");
                customerEmail = in.nextLine();
                System.out.println("Enter credit:");
                credit = in.nextDouble();
                VipCustomer customCredit = new VipCustomer(customerName,customerEmail,credit);
                System.out.println("\nYour package info:\n"+"Name: "+customCredit.getCustomerName()+"\n"+
                        "Email: "+customCredit.getCustomerEmail()+"\n"+"Credit: "+customCredit.getCreditLimit());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
