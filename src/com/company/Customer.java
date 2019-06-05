package com.company;

public class Customer
{
    private String customerName;
    private int customerSSN;
    private int customerID;

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public int getCustomerSSN()
    {
        return customerSSN;
    }

    public void setCustomerSSN(int customerSSN)
    {
        this.customerSSN = customerSSN;
    }

    public int getCustomerID()
    {
        return customerID;
    }

    public void setCustomerID(int customerID)
    {
        this.customerID = customerID;
    }

    public String toString()
    {
        return String.format("%30s%30s%30d%30s\n", customerName, customerSSN, customerID);
    }
}
