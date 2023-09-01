/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybank;

/**
 *
 * @author User
 */
public class ClassChallenge {

    
    
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

    public boolean depositFunds(double amount) {  
        if(accountBalance - amount >= 0){
            accountBalance += amount;
            return true;
        }else{
            return false;
        }
        
    }

    public boolean withdrawFunds(double amount) {
           if (accountBalance - amount >= 0) {
               accountBalance -= amount;
               return true;
           
           }else{
               return false;
           }
    }

    public void displayFunds() {
        System.out.println("Updated balance: $" + accountBalance);
    }
}
    
    
    

    

