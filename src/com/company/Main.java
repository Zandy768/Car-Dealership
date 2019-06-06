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

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> dealer = new ArrayList<>();
        List<String> salesPerson = new ArrayList<>();
        List<String> salesLead = new ArrayList<>();
        List<String> customer = new ArrayList<>();
        List<String> inventory = new ArrayList<>();
        List<String> vehicle = new ArrayList<>();
        List<String> parts = new ArrayList<>();

        Dealership d1 = new Dealership(0, "Cars4Sale", "123 Cars Road");
        dealer.add(d1.toString());
        System.out.println(dealer);

        SalesPerson s1 = new SalesPerson(0, "Same",0000);
        salesPerson.add(s1.toString());
        System.out.println(salesPerson);

        SalesLeads sl1 = new SalesLeads(0,"Same",100);
        salesLead.add(sl1.toString());
        System.out.println(salesLead);

        Customer c1 = new Customer(0,"Max", 000000000);
        customer.add(c1.toString());
        System.out.println(customer);

        Inventory i1 = new Inventory(0,"Used Cars",200);
        inventory.add(i1.toString());
        System.out.println(inventory);

        Vehical v1 = new Vehical(0,"Ford","Focus");
        vehicle.add(v1.toString());
        System.out.println(vehicle);

        Parts p1= new Parts(0,"Tires",300);
        parts.add(p1.toString());
        System.out.println(parts);
    }
}
