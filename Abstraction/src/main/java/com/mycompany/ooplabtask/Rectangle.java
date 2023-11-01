
package com.mycompany.ooplabtask;


public class Rectangle extends Shape{
    
   private double Lenght,width;

    public Rectangle(double Lenght, double width) {
        this.Lenght = Lenght;
        this.width = width;
    }
    
    void diplayInfo(){
        System.out.println("Lenght: "+Lenght);
        System.out.println("Width: "+width);
    }
   void area(){
       System.out.println("The Area: "+Lenght*width);
   }

    public double getLenght() {
        return Lenght;
    }

    public void setLenght(double Lenght) {
        this.Lenght = Lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

   
   
    
}
