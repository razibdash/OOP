
package com.mycompany.ooplabtask;

public class Square extends Shape{
    private double a;

    public Square(double a) {
        this.a = a;
    }
      @Override
     void diplayInfo(){
        System.out.println("A: "+a);
       
    }
    @Override
   void area(){
       System.out.println("The Area: "+a*a);
       
   }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
   
}
