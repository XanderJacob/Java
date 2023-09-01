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


class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        accountBalance += amount;
        System.out.println("Deposit of $" + amount + " successful");
        System.out.println("Updated balance: $" + accountBalance);
    }

    public void withdrawFunds(double amount) {
        if (accountBalance - amount >= 0) {
            accountBalance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful");
            System.out.println("Updated balance: $" + accountBalance);
        } else {
            System.out.println("Insufficient funds. Withdrawal canceled.");
            System.out.println("Balance: $" + accountBalance);
        }
    }
    
    
}
public class MyBank {

     public static void main(String[] args) {
      BankAccount account = new BankAccount();
      
       
        account.setAccountNumber("1234567890");
        account.setAccountBalance(1000.0);
        account.setCustomerName("John Doe");
        account.setEmail("johndoe@example.com");
        account.setPhoneNumber("1234567890");

        System.out.println("Account details:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Phone Number: " + account.getPhoneNumber());
        System.out.println("Initial Balance: $" + account.getAccountBalance());

        account.depositFunds(500.0);
        account.withdrawFunds(200.0);
        account.withdrawFunds(1500.0);
    
     }
}