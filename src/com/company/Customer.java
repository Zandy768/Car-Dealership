package com.company;

public class Customer
{
    private int customerID;
    private String customerName;
    private int customerSSN;

    public Customer(int customerID, String customerName, int customerSSN)
    {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerSSN = customerSSN;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public int getCustomerSSN()
    {
        return customerSSN;
    }

    public int getCustomerID()
    {
        return customerID;
    }

    public String toString()
    {
        return ("Customer ID: " + customerID + "\n" + "Name: " + customerName + "\n" + "SSN: " + customerSSN);
    }
}
