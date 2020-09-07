/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project00;

/**
 *
 * @author ruchi
 */
public class Triangle extends Shape { 
    public double side_A; 
    public double side_B; 
    public double side_C; 
    public Triangle(String name){
        super(name);  
    }  
     void setDimensions(double sideA, double sideB, double sideC) { 
         side_A = sideA; 
        side_B = sideB; 
        side_C = sideC; 
    }
    
    public void printDimensions(){
        System.out.println("This triangle is of three sides \n sideA: " + side_A + "\n sideB: "+ side_B + "\n sideC: " + side_C);
    }  
    
    public double getArea(){ 
        double s = (side_A + side_B + side_C) / 2; 
        double almost = s * (s-side_A) * (s-side_B) * (s-side_C);
       return Math.sqrt(almost);
    }
}
