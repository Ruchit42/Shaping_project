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
    public Circle(String name){
        super(name); 
        
    } 
    void setDimensions(double radius1) {
        radius = radius1; //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void printDimensions(){
        System.out.println("This circle is of radius: "+ radius );
    }
    @Override
    public double getArea(){
        return 3.14*radius*radius ; 
    }
}
