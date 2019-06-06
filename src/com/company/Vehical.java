package com.company;

public class Vehical
{
    private int carID;
    private String carMake;
    private String carModel;

    public Vehical(int carID, String carMake, String carModel)
    {
        this.carID = carID;
        this.carMake = carMake;
        this.carModel = carModel;
    }

    public String getCarMake()
    {
        return carMake;
    }

    public String getCarModel()
    {
        return carModel;
    }

    public int getCarID()
    {
        return carID;
    }

    public String toString()
    {
        return("Car ID: " + carID + "\n" + "Make: " + carMake + "\n" + "Model: " + carModel);
    }
}
