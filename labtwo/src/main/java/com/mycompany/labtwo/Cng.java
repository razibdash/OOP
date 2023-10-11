
package com.mycompany.labtwo;

public class Cng extends Car{
     private int numberOfwheels;
    public Cng(String model,
            String type,
            int buildYear,
            int numOfState, 
            int engine) {
        
        super(model, type, buildYear, numOfState, engine);
        
    }

    public Cng(String model, String type, int buildYear, int numOfState, int engine,int numberOfwheels) {
        
        super(model, type, buildYear, numOfState, engine); 
        this.numberOfwheels = numberOfwheels;
    }
    
    @Override
   public String getInfo(){
      return super.getInfo()  + " numberOfwheels: "+numberOfwheels;
      
   }

    public int getNumberOfwheels() {
        return numberOfwheels;
    }

    public void setNumberOfwheels(int numberOfwheels) {
        this.numberOfwheels = numberOfwheels;
    }
    
    
}
