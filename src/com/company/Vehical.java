package com.company;

public class Vehical extends Inventory
{
    private String carMake;
    private String carModel;
    private int carID;

    public String getCarMake()
    {
        return carMake;
    }

    public void setCarMake(String carMake)
    {
        this.carMake = carMake;
    }

    public String getCarModel()
    {
        return carModel;
    }

    public void setCarModel(String carModel)
    {
        this.carModel = carModel;
    }

    public int getCarID()
    {
        return carID;
    }

    public void setCarID(int carID)
    {
        this.carID = carID;
    }

    public String toString()
    {
        return String.format("%30s%30s%30d%30s\n", carMake, carModel, carID);
    }
}
