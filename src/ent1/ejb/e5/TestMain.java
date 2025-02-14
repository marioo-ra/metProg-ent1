package ent1.ejb.e5;

import ent1.ejb.e5.Account;

public class TestMain {
    public static void main(String[] args){
// Test Customer class
        Customer c1 = new Customer(88,"Ten Ah Teck",'m');
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());
        Customer c2 = new Customer(888,"Ten Ah",'m');

// Test Account class
        Account ac1 = new Account(101,c1,888.8);
        Account ac2 = new Account(1001,c2);
        System.out.println(ac1);
        System.out.println(ac2);
        System.out.println("id is:" + ac1.getId());
        System.out.println("customer is: " + ac1.getCustomer());
        System.out.println("balance is: " + ac1.getBalance());
        System.out.println("customer's id is: " + ac1.getCustomerId());
        System.out.println("customer's gender is: " + ac1.getCustomerGender());
        ac1.deposit(8);
        System.out.println("balance is: " + ac1.getBalance());
        ac1.withdraw(88);
        System.out.println("balance is: " + ac1.getBalance());




    }
}
