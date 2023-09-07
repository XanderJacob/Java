/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author User
 */
public class MyPoint {
    
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double getDistance(MyPoint point) {
        return getDistance(point.getX(), point.getY());
    }

    public double getDistance() {
        return getDistance(0, 0);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

   public int getQuadrant(){
        if(x == 0 && y == 0){
            return 0;
        }else if(x == 0){
            return 5;
        }else if(y == 0){
            return 6;
        }else if(x > 0 && y > 0){
            return 1;
        }else if (x < 0 && y>0){
            return 3;
        }else{
            return 4;
        }
    } 
    
    
    public double getAngle(){
        return Math.atan2(y, x);
    }
}

    

