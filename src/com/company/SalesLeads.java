package com.company;

public class SalesLeads
{
    private int leadID;
    private String leadName;
    private int numberSold;

    public SalesLeads(int leadID, String leadName, int numberSold)
    {
        this.leadID = leadID;
        this.leadName = leadName;
        this.numberSold = numberSold;
    }

    public String getLeadName()
    {
        return leadName;
    }

    public int getLeadID()
    {
        return leadID;
    }

    public int getNumberSold()
    {
        return numberSold;
    }

    public String toString()
    {
        return ("Lead ID: " + leadID + "\n" + "Name: " + leadName + "\n" + "Sold: " + numberSold);
    }
}
