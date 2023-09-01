/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mytime;

/**
 *
 * @author User
 */
public class MyTime {

    public static void main(String[] args) {
        System.out.println("This is my Clock");

        Time newTime = new Time(12, 45, 7, false);

        
        System.out.println("Initial Time: " + newTime.toString());

        
        newTime.tickBySeconds();
        
       
        System.out.println("Updated Time: " + newTime.toString());
    }
}
