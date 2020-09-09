/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project00;
import java.util.Scanner;
/**
 *
 * @author ruchi
 */
public class Project00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        //Shape test = new Square("Trying"); 
        
        
        Square One = new Square("Square");    
        Circle two = new Circle("Circle"); 
        Triangle three = new Triangle("Tri"); 
        EquilateralTriangle four = new EquilateralTriangle("E_Tri"); 
        
        System.out.println("Welcome to Shapes!!\n");
        System.out.println("We have 4 shape\n");
        
        System.out.println("Please enter the dimenstion for Square: \n");
        System.out.println("Length: "); 
        Scanner length_ = new Scanner(System.in); 
        double length = length_.nextDouble();  
        System.out.println("Height: ");
        Scanner height_ = new Scanner(System.in);  
        double height = height_.nextDouble(); 
        System.out.println("All set!\n"); 
        One.setDimensions(length, height); 
        
        
        System.out.println("Please enter the radius for Circle: \n");
        System.out.println("Radius: ");
        double rad = length_.nextDouble();    
        two.setDimensions(rad);
        
        System.out.println("Please enter all three side of the triangle: \n");
        System.out.println("Side One: ");
        double sideA = length_.nextDouble(); 
        System.out.println("\nSide Two: "); 
        double sideB = length_.nextDouble(); 
        System.out.println("\nSide Three: ");
        double sideC = length_.nextDouble();  
          three.setDimensions(sideA, sideB, sideC);
        
        System.out.println("Please enter the length on the side of the Equilateral Triangle: \n");
        System.out.println("Side One: ");
        double one_side = length_.nextDouble();
        four.setDimensions(sideA);
        
        
        System.out.println("All set; here are the shapes\n");
        System.out.print("The square with name "+ One.getName() + " ");One.printDimensions(); System.out.println("with an area of " + One.getArea() + "\n");
        System.out.println("The circle with name "+ two.getName() + " ");two.printDimensions(); System.out.println("with an area of " + two.getArea() + "\n");
        System.out.println("The triangle with name "+ three.getName() + " ");three.printDimensions();System.out.println("with an area of " + three.getArea() +"\n");
        System.out.println("The Eqilateral triangle with name "+ four.getName() + " ");four.printDimensions(); System.out.println("with an area of " + four.getArea() + "\n");
        
        
        
        
        
    }
    
}
