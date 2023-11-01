
package com.mycompany.ooplabtask;

public class Triangle extends Shape{
    private double base,height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
     void diplayInfo(){
        System.out.println("Base: "+base);
        System.out.println("Height: "+height);
    }
    @Override
   void area(){
       System.out.println("The Area: "+0.5*base*height);
   }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
   
}
