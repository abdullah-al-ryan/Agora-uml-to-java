package com.company;

import java.util.Scanner;

public class Product {
    public int id;
    public String name;
    public double price;

    Scanner x = new Scanner(System.in);
    int av= x.nextInt();

    public void available(int av)
    {

        if (av == 1)
            {
            System.out.println("It is available");
            }
        else
            {
            System.out.println("It is not available");
            }
    }



}
