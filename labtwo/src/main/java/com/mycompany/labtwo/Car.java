/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labtwo;

public class Car {
    private String model,type;
    private int buildYear,numOfState,engine;

    
    //Constructor
    public Car(String model) {
        this.model = model;
    }

    public Car(String model, String type) {
        this(model);
        this.type = type;
    }

    public Car(String model, String type, int buildYear) {
       this(model,type);
        this.buildYear = buildYear;
    }

    public Car(String model, String type, int buildYear, int numOfState) {
       this(model,type,buildYear);
        this.numOfState = numOfState;
    }
   
    public Car(String model, String type, int buildYear, int numOfState, int engine) {
        this(model,type,buildYear,numOfState);
        this.engine = engine;
    }
    
    // Copy constructor

    Car(Car oldCar){
        this(oldCar.model,oldCar.type,oldCar.buildYear,oldCar.numOfState,oldCar.engine);
    }
    
    
    public String getInfo(){
        return "Model: "+model + "  type: "+ type + "  buildYear: "+buildYear + " numOfState: "+numOfState + " engine: "+engine;
    }
    
    private double getEfficiency(){
        return 2.4876 * engine / 1.45;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public int getNumOfState() {
        return numOfState;
    }

    public void setNumOfState(int numOfState) {
        this.numOfState = numOfState;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }
    
    
    
    
    
    
}

