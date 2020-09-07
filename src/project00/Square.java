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
public class Square extends Shape {
    public double length; 
    public double height; 
    public  Square(String name){
        super(name); 
        
    } 
    public void setDimensions(double length1, double height1){
        length  = length1;
        height = height1;
    }
    
    public void printDimensions(){
        System.out.println("This square id of length: " + length + " height: " + height);
    } 
    
    public double getArea(){
        return length*height; 
    }
} 
    
 