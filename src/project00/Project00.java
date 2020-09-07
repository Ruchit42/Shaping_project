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
public class Project00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Shape test = new Square("Trying"); 
        System.out.println(test.getArea());  
        test.setDimensions(4.5,2.0); 
        System.out.println(test.getArea());
        
    }
    
}
