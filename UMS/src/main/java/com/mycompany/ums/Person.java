
package com.mycompany.ums;

public class Person {
    private String name,address,number,blood;
   public Person(){
        this.name="null";
        this.address="null";
        this.number="null";
        this.blood="null";
    }
    public Person(String name){
        this.name=name;
    }
    public Person(String name, String address) {
        this(name);
        this.address = address;
    }
    
    public Person(String name, String address, String number){
        this(name,address);
        this.number=number;
    }
    public Person(String name, String address, String number, String blood) {
       this(name,address);
        this.number = number;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
    public void DisplayInfo(){
        
        if(name != null){
          System.out.println("Name: "+name);   
        }
        if(address!=null){
            System.out.println("Address: "+address);
        }
        if(number!=null){
          System.out.println("Number: "+number);   
        }
        if(blood!=null){
          System.out.println("Blood: "+blood);   
        }
       
       
        
    }
}
