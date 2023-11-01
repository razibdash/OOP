
package com.mycompany.ooplabtask;


public class Circle extends Shape {
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }
      @Override
     void diplayInfo(){
        System.out.println("R: "+r);
      
    }
    @Override
   void area(){
       System.out.println("The Area: "+Math.PI*r*r);
   }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
   
}
