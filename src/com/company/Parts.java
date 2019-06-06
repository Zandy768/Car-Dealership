package com.company;

public class Parts
{
    private int partsID;
    private String partsName;
    private int partsSold;

    public Parts(int partsID, String partsName, int partsSold)
    {
        this.partsID = partsID;
        this.partsName = partsName;
        this.partsSold = partsSold;
    }

    public String getPartsName()
    {
        return partsName;
    }

    public int getPartsSold()
    {
        return partsSold;
    }

    public int getPartsID()
    {
        return partsID;
    }

    public String toString()
    {
        return ("Part ID: " + partsID + "\n" + "Name: " + partsName + "\n" + "Sold: " + partsSold);
    }
}
