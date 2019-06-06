package com.company;

public class Dealership
{
    private int dealershipID;
    private String dealershipName;
    private String dealershipAddress;

    public Dealership(int dealershipID, String dealershipName, String dealershipAddress)
    {
        this.dealershipID = dealershipID;
        this.dealershipName = dealershipName;
        this.dealershipAddress = dealershipAddress;
    }

    public String getDealershipName()
    {
        return dealershipName;
    }

    public String getDealershipAddress()
    {
        return dealershipAddress;
    }

    public int getDealershipID()
    {
        return dealershipID;
    }

    public String toString()
    {
        return("ID: "+ dealershipID + "\n" + "Dealership Name: " + dealershipName + "\n" + "Address: " + dealershipAddress);
    }
}
