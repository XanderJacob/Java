
package com.mycompany.empproject6;


public class Name {
    private String firstName;
    private String midI;
    private String lastName;
    private String suffix;

    public Name() {
    }
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Name(String firstName, String midI, String lastName) {
        this.firstName = firstName;
        this.midI = midI;
        this.lastName = lastName;
    }
    
    public Name(String firstName, String midI, String lastName, String suffix) {
        this.firstName = firstName;
        this.midI = midI;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMidI() {
        return midI;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMidI(String midI) {
        this.midI = midI;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
      
   @Override
   public String toString(){
       if(lastName == null){
           return String.format("%s", firstName);
       }
       if (midI == null){
           return String.format("%s %s", firstName, lastName);
       } 
       return String.format("%s %c %s", firstName, midI, lastName);
   }
    
}