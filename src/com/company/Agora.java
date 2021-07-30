package com.company;

public class Agora {
    public Product pr;
    public Customer cu;
    public Salesperson sa;

    public Agora(Product pr, Customer cu, Salesperson sa)
    {
        System.out.println("Welcome to Agora Super Shop");
        pr.available();
        cu.member();
        sa.sale();

    }

    public static void main(String[] args) {

        Product pro = new Product();
        Customer cust = new Customer();
        Salesperson sales = new Salesperson();
        Agora a = new Agora(pro,cust,sales);
    }
}
