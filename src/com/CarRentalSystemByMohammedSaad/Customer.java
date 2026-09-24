package com.CarRentalSystemByMohammedSaad;

public class Customer {
    String customerName;
    String customerId;
    int customerAge;

    public Customer(String customerId, String customerName, int customerAge){
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAge = customerAge;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerId(){
        return customerName;
    }

    public int getCustomerAge(){
        return customerAge;
    }
}
