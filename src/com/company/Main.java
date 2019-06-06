/*
Project: Team Project 1
Purpose Details: Car dealership
Course: IST 242
Author: Team 2
Date Developed: 6/2/19
Last Date Changed: 6/5/19
Revision: 3
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
        Dealership d2 = new Dealership(1, “Cars4U”, “555 Five Street”);
        dealer.add(d1.toString());
        dealer.add(d2.toString());
        System.out.println(dealer);

        SalesPerson s1 = new SalesPerson(0, "Sam",0000);
        SalesPerson s2 = new SalesPerson(1, “Bob”,1111);
        salesPerson.add(s1.toString());
        salesPerson.add(s2.toString());
        System.out.println(salesPerson);

        SalesLeads sl1 = new SalesLeads(0,"Sam",100);
        SalesLeads sl2 = new SalesLeads(1,”Bob”,200);
        salesLead.add(sl1.toString());
        salesLead.add(sl2.toString());
        System.out.println(salesLead);

        Customer c1 = new Customer(0,"Max", 000000000);
        Customer c2 = new Customer(1,”Chris”,111111111);
        customer.add(c1.toString());
        customer.add(c2.toString());
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
