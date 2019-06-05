package com.company;

public class Parts extends Inventory
{
    private String partsName;
    private int partsSold;
    private int partsID;

    public String getPartsName()
    {
        return partsName;
    }

    public void setPartsName(String partsName)
    {
        this.partsName = partsName;
    }

    public int getPartsSold()
    {
        return partsSold;
    }

    public void setPartsSold(int partsSold)
    {
        this.partsSold = partsSold;
    }

    public int getPartsID()
    {
        return partsID;
    }

    public void setPartsID(int partsID) {
        this.partsID = partsID;
    }

    public String toString()
    {
        return String.format("%30s%30s%30d%30s\n", partsName, partsSold, partsID);
    }
}
