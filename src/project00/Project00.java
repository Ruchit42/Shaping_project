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
        
        
        Shape One = new Square("Square");    
        Shape two = new Circle("Circle"); 
        Shape three = new Triangle("Tri"); 
        Shape four = new EquilateralTriangle("E_Tri");
        System.out.println("Welcome to Shapes!!\n");
        System.out.println("We have 4 shape\n");
        System.out.println("Please enter the dimenstion for Square: \n");
        System.out.println("Length: "); 
        Scanner length_ = new Scanner(System.in); 
        double length = length_.nextDouble();  
        System.out.println("Height: ");
        Scanner height_ = new Scanner(System.in);  
        double height = height_.nextDouble(); 
        One.setDimensions(length, height); 
        System.out.println("All set!\n");
        One.printDimensions();
        
        
        
        
    }
    
}
