package com.company;

public class SalesLeads
{
    private String leadName;
    private int leadID;
    private int numberSold;

    public String getLeadName()
    {
        return leadName;
    }

    public void setLeadName(String leadName)
    {
        this.leadName = leadName;
    }

    public int getLeadID()
    {
        return leadID;
    }

    public void setLeadID(int leadID)
    {
        this.leadID = leadID;
    }

    public int getNumberSold()
    {
        return numberSold;
    }

    public void setNumberSold(int numberSold)
    {
        this.numberSold = numberSold;
    }

    public String toString()
    {
        return String.format("%30s%30s%30d%30s\n", leadName, leadName, numberSold);
    }
}
