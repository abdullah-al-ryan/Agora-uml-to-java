package com.company;

import java.util.Scanner;

public class Customer {
    public String cName;
    public String address;
    public String memType;
    public int id;

    Scanner y = new Scanner(System.in);
    int i= y.nextInt();
    int mem = y.nextInt();
    double totalCost=10000.0;
    public void member(int i)
    {
        if(i==1)
        {
            System.out.println("He is a member member");
            if(mem==1)
            {
                System.out.println("And also a Gold member");
                double go=totalCost*0.5;
                System.out.println("Gold member has got discount of "+go+" taka");
                System.out.println("Payable tax= "+(totalCost-go));
            }
            else
            {
                double go=totalCost*0.3;
                System.out.println("And also a Silver member");
                System.out.println("Payable tax= "+(totalCost-go));
            }
        }
        else {
            System.out.println("He is a regular customer");
            System.out.println("Pay " + (totalCost + (totalCost * 0.2)));
        }
    }

}
