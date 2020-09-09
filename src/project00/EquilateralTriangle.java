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
public class EquilateralTriangle extends Triangle { // child of the triangle class 
    public double sideOne;  // only need one side, since all side are equale 
    public EquilateralTriangle(String name){
        super(name); // get the name from the triangle class 
    } 
     void setDimensions(double side1) {
        sideOne = side1; 
    }  
     @Override
     public void printDimensions(){
        System.out.println("This Equilateral triangle named "+ " has the length of : "+ sideOne );
    }
     @Override
    public double getArea(){ // area of a triangel 
        double s = (sideOne*3) / 2; 
        double almost = s * (s-sideOne) *3;
       return Math.sqrt(almost);
    }
}
