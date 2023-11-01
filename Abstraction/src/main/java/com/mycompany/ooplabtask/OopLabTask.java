
package com.mycompany.ooplabtask;


public class OopLabTask {

    public static void main(String[] args) {
       
        Shape test;
        test=new Triangle(5,6);
        test.diplayInfo();
        test.area();
        test= new Rectangle(6,7);
        test.diplayInfo();
        test.area();
        test = new Circle(4);
        test.diplayInfo();
        test.area();
        test= new Square(6);
        test.diplayInfo();
        test.area();
    }
}
