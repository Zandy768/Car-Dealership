package com.company;

public class SalesPerson
{
    private String salespersonName;
    private int salespersonPassword;
    private int salespersonID;

    public String getSalespersonName()
    {
        return salespersonName;
    }

    public void setSalespersonName(String salespersonName)
    {
        this.salespersonName = salespersonName;
    }

    public int getSalespersonPassword()
    {
        return salespersonPassword;
    }

    public void setSalespersonPassword(int salespersonPassword)
    {
        this.salespersonPassword = salespersonPassword;
    }

    public int getSalespersonID()
    {
        return salespersonID;
    }

    public void setSalespersonID(int salespersonID)
    {
        this.salespersonID = salespersonID;
    }

    public String toString()
    {
        return String.format("%30s%30s%30d%30s\n", salespersonName, salespersonPassword, salespersonID);
    }
}
