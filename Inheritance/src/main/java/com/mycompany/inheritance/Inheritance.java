
package com.mycompany.inheritance;

public class Inheritance {

    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();
        teacher1.name="Rajib Dash";
        teacher1.age=22;
        teacher1.address="Sylhet";
        teacher1.qualification="M.Sc in CSE";
        teacher1.Display();
        
        Person person1 = new Person();
        person1.name="Avronil Rajib";
        person1.age=21;
        person1.address="Sylhet";
        person1.DisplayInformation();
        
         Person person2 = new Person();
        person2.name="Raj Dash";
        person2.age=24;
        person2.address="Sylhet";
        person2.DisplayInformation();
        
        
         Teacher teacher2 = new Teacher();
        teacher2.name="Sagor Dash";
        teacher2.age=23;
        teacher2.address="Sylhet";
        teacher2.qualification="M.Sc in CSE";
        teacher2.Display();
    }
}
