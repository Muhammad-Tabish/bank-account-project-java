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
public class BankAccJava {

    
    String accountId;
    String accountName;
    double balance;
// Constructor
   public BankAccJava(String AccountId, String name, double  Balance)
    {
   
    
  accountId = AccountId;
  accountName = name;
  balance = Balance;
  
   }


   public void deposit(double amount)
  {
      double Balance =balance + amount;
      balance = Balance;
  }
   public void withdraw(double amount)
  {

   double Balance = balance - amount;
     balance = Balance;
   }




    public String toString()
  { 
    return "accountId : "+ accountId +"\n accountName: " + accountName + "\nbalance :$" + balance;
    
        

  }
  }
 