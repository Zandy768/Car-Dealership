package com.company;

public class Dealership
{
    private String dealershipName;
    private String dealershipAddress;
    private int dealershipID;

    public String getDealershipName()
    {
        return dealershipName;
    }

    public void setDealershipName(String dealershipName)
    {
        this.dealershipName = dealershipName;
    }

    public String getDealershipAddress()
    {
        return dealershipAddress;
    }

    public void setDealershipAddress(String dealershipAddress)
    {
        this.dealershipAddress = dealershipAddress;
    }

    public int getDealershipID()
    {
        return dealershipID;
    }

    public void setDealershipID(int dealershipID)
    {
        this.dealershipID = dealershipID;
    }

    public String toString()
    {
        return String.format("%30s%30s%30d%30s\n", dealershipName, dealershipAddress, dealershipID);
    }
}
