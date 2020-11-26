/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankacc.java;

/**
 *
 * @author Muhammad Tabish
 */
public class testbankacc {
    public static void main(String[] args) {
       BankAccJava acc1 = new BankAccJava("A0004", "Bill Jones", 123);
       BankAccJava acc2 = new BankAccJava("A0003", "James Bond", 1500);


        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println("-----------------");
        acc1.deposit(417);
        acc2.withdraw(200);

        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println("-----------------");

        acc2.accountName = "Dr Evil";

        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println("-----------------");

    }
    
}
