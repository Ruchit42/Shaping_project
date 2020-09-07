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
    public double sideA; 
    public double sideB; 
    public double sideC; 
    public Triangle(String name,double sideA, double sideB, double sideC){
        super(name);  
        this.sideA = sideA; 
        this.sideB = sideB; 
        this.sideC = sideC; 
        
    } 
    
    public void printDimensions(){
        System.out.println("This triangle is of three sides \n sideA: " + sideA + "\n sideB: "+ sideB + "\n sideC: " + sideC);
    }  
    
    public double getArea(){ 
        double s = (sideA + sideB + sideC) / 2; 
        double almost = s * (s-sideA) * (s-sideB) * (s-sideC);
       return Math.sqrt(almost);
    }
}
