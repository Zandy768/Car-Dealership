package com.company;

public class Inventory
{
    private String inventoryName;
    private int numberSold;
    private int inventoryID;

    public String getInventoryName()
    {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName)
    {
        this.inventoryName = inventoryName;
    }

    public int getNumberSold()
    {
        return numberSold;
    }

    public void setNumberSold(int numberSold)
    {
        this.numberSold = numberSold;
    }

    public int getInventoryID()
    {
        return inventoryID;
    }

    public void setInventoryID(int inventoryID)
    {
        this.inventoryID = inventoryID;
    }

    public String toString()
    {
        return String.format("%30s%30s%30d%30s\n", inventoryName, numberSold, inventoryID);
    }
}
