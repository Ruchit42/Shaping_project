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
    public double length; // initial variable for the square 
    public double height; 
    public  Square(String name){
        super(name); // get the variable from the super class 
        
    } 
    public void setDimensions(double length1, double height1){
        length  = length1;
        height = height1;  // sets the variable from the user
    }
    @Override
    public void printDimensions(){
        System.out.println("This square is of length: " + length + " height: " + height); // prints outs the components 
    } 
    @Override
    public double getArea(){
        return length*height;  // area of a Square 
    }
} 
    
 