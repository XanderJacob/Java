/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybank;


/**
 *
 * @author User
 * 
 */


public class MyBank {

    public static void main(String[] args) {
        ClassChallenge account = new ClassChallenge();

        account.setAccountNumber(22102588);
        account.setAccountBalance(1000.0);
        account.setCustomerName("Xander Jacob");
        account.setEmail("waragud@gmail.com");
        account.setPhoneNumber("0945678322");

        System.out.println("Account details:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Phone Number: " + account.getPhoneNumber());
        System.out.println("Initial Balance: $" + account.getAccountBalance());

        account.depositFunds(500.0);
        account.displayFunds();
        account.withdrawFunds(200.0);
        account.displayFunds();
        account.withdrawFunds(1300.0);
          account.displayFunds();
          
        
        
       
     
        
        
    }
}
