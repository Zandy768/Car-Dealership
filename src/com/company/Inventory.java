package com.company;

public class Inventory
{
    protected int inventoryID;
    protected String inventoryName;
    protected int numberSold;

    public Inventory(int inventoryID, String inventoryName, int numberSold)
    {
        this.inventoryID = inventoryID;
        this.inventoryName = inventoryName;
        this.numberSold = numberSold;
    }

    public String getInventoryName()
    {
        return inventoryName;
    }

    public int getNumberSold()
    {
        return numberSold;
    }

    public int getInventoryID()
    {
        return inventoryID;
    }

    public String toString()
    {
        return ("Inventory ID: " + inventoryID + "\n" + "Name: " + inventoryName + "\n" + "Sold: " + numberSold);
    }
}
