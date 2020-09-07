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
public class Circle extends Shape { 
    public double radius; 
    public Circle(String name, double radius){
        super(name); 
        this.radius = radius; 
    } 
    
    public void printDimensions(){
        System.out.println("This circle is of radius: "+ radius);
    }
    public double getArea(){
        return 3.14*radius*radius ; 
    }
}
