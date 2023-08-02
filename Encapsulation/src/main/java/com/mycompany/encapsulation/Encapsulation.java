
package com.mycompany.encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
       
        System.out.println("Encapsulation");
        Person person1 = new Person("Rajib Dash",22,"Sylhet","01823913194","avronilrajib@gmail.com","10-03-2001");
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getAddress());
        System.out.println(person1.getEmail());
        System.out.println(person1.getBirthDay());
       
    }
}
