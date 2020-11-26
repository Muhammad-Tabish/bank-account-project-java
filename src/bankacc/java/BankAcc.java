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

class BankAcc {
   private  String accountId;
    private String accountName;
    private double balance;
    


 public BankAcc(String AccountId, String name, double  Balance)
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
   
   
   public String getId(){
        return accountId;
    }
    public void setId(String newId){
        this.accountId = newId;
    }

    public String getName(){
        return accountName;
    }
    public void setName(String newName){
        this.accountName = newName;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double newBalance){
        this.balance = newBalance;
    }





    public String toString()
  { 
    return "accountId : "+ accountId +"\n accountName: " + accountName + "\nbalance :$" + balance;
    
        

  }
  }


