
package com.mycompany.inheritance;


public class Teacher extends Person {
    
    String qualification;  
    
    void Display(){
        
        
        System.out.println("\n");
        System.out.println("Teacher Information");
        DisplayInformation();
        System.out.println("qualification: "+qualification);
        
    }
    
}
