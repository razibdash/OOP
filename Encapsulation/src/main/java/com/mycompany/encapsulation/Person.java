
package com.mycompany.encapsulation;

public class Person {
    private String name;
    private int age;
    private String address;
    private String number;
    private String email;
    private String birthDay;

    public Person(String name, int age, String address, String number, String email, String birthDay) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.number = number;
        this.email = email;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    
    
}
