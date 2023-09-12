
package com.mycompany.ums;


public class UMS {

    public static void main(String[] args) {
        Students rajib = new Students("Rajib Dash","221-115-075","computer science","56","metropolitan university");
        rajib.DisplayInfo();
        Students saurov = new Students("Saurov Paul","221-115-070","computer science","56","metropolitan university");
        saurov.DisplayInfo();
        Students arnab = new Students("Arnab Chowdhury","221-115-068","computer science","56","metropolitan university");
        arnab.DisplayInfo();
         Students proyash = new Students("Proyash Dash","221-115-043","computer science","56","metropolitan university");
        proyash.DisplayInfo();
        Students tisha = new Students("Mughni Rayhan Tisha","221-115-044","computer science","56","metropolitan university");
        tisha.DisplayInfo();
        Students mowly = new Students("Mowly Roy","221-115-045","computer science","56","metropolitan university");
        mowly.DisplayInfo();
        
        
        Teachers jakaria = new Teachers("Abu Jafar Md Jakaria","Sylhet","01789879672","A+","Computer Science","B.Sc In CSE","metropolitan university");
        jakaria.DisplayInfo();
        Teachers rafee = new Teachers("Md. Mushtaq Shahriyar Rafee","Sylhet","01789876692","B+","Computer Science","B.Sc In CSE","metropolitan university");
        rafee.DisplayInfo();
        Teachers nasif = new Teachers("Nasif Istiak Remon","Sylhet","01721279672","AB+","Computer Science","B.Sc In CSE","metropolitan university");
        nasif.DisplayInfo();
        
        
    }
}
