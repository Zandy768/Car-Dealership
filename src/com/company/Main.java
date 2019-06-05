/*
Project: Team Project 1
Purpose Details: Car dealership
Course: IST 242
Author: Team 2
Date Developed: 6/2/19
Last Date Changed: 6/5/19
Revision: 2
*/

package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Dealership one = new Dealership();

        one.setDealershipName("Cars4Sale");

        one.setDealershipAddress("123 Cars Road");

        one.setDealershipID(123456);

        System.out.println(one.getDealershipAddress() + " " + one.getDealershipName() + " " + one.getDealershipID());

        SalesPerson two = new SalesPerson();

        two.setSalespersonName("Sam");

        two.setSalespersonPassword(1111);

        two.setSalespersonID(2222);

        SalesLeads three=new SalesLeads();

        three.setLeadName("Sam");

        three.setLeadID(3333);

        three.setNumberSold(100);

        Customer four=new Customer();

        four.setCustomerName("Max");

        four.setCustomerSSN(111111111);

        four.setCustomerID(4444);

        Inventory five=new Inventory();

        five.setInventoryName("Used Cars");

        five.setNumberSold(200);

        five.setInventoryID(5555);

        Vehical six= new Vehical();

        six.setCarMake("Ford");

        six.setCarModel("Focus");

        six.setCarID(6666);

        Parts seven= new Parts();

        seven.setPartsName("Tires");

        seven.setPartsSold(300);

        seven.setPartsID(7777);
    }
}
