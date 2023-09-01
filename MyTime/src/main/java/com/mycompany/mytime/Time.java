/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mytime;

/**
 *
 * @author User
 */
public class Time {
        private int seconds;
        private int minutes;
        private int hours;
        private boolean meridian;
        
        
        public Time(){
            this.seconds = 0;
            this.minutes = 0;
            this.hours = 0;
            this.meridian = false;
        }
        
        public Time(int seconds, int minutes, int hours, boolean meridian){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.meridian = meridian;
        }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public String isMeridian() {
        return meridian ? "AM": "PM";
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMeridian(boolean meridian) {
        this.meridian = meridian;
    }
    
    public void tickBySeconds() {
        if (seconds < 59) {
            seconds++;
        } else {
            seconds = 0;
            if (minutes < 59) {
                minutes++;
            } else {
                minutes = 0;
                if (hours < 11) { 
                    hours++;
                } else {
                    hours = 0;
                    meridian = !meridian; 
                }
            }
        }
    }
public void tickByMinute() {
    if (minutes < 59) {
        minutes++;
    } else {
        minutes = 0;
        if (hours < 11) { 
            hours++;
        } else {
            hours = 0;
            if (meridian) {
                meridian = false;
            } else {
                meridian = true;
            }
        }
    }
}

public void tickByHour() {
    if (hours < 11) { 
        hours++;
    } else {
        hours = 0;
        if (meridian) {
            meridian = false;
        } else {
            meridian = true;
        }
    }
}

public void displayTime12() {
        System.out.printf("%02d:%02d:%02d %s\n", getHours(), getMinutes(), getSeconds(), isMeridian());
    }

public void displayTime24() {
        System.out.printf("%02d:%02d:%02d\n", getHours(), getMinutes(), getSeconds());
    }
    
        @Override
 public String toString() {
    String meridianStr = meridian ? "AM" : "PM";
    return String.format("%02d:%02d:%02d %s", hours, minutes, seconds, meridianStr);
}   
}
