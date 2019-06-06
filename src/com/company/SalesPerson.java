package com.company;

public class SalesPerson
{
    private int salespersonID;
    private String salespersonName;
    private int salespersonPassword;

    public SalesPerson(int salespersonID, String salespersonName, int salespersonPassword)
    {
        this.salespersonID = salespersonID;
        this.salespersonName = salespersonName;
        this.salespersonPassword = salespersonPassword;
    }

    public String getSalespersonName()
    {
        return salespersonName;
    }

    public int getSalespersonPassword()
    {
        return salespersonPassword;
    }

    public int getSalespersonID()
    {
        return salespersonID;
    }

    public String toString()
    {
        return("Salesperson ID: " + salespersonID + "\n" + "Name: " + salespersonName + "\n" + "Password: " + salespersonPassword);
    }
}
