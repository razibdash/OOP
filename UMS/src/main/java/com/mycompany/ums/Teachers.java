
package com.mycompany.ums;

public class Teachers extends Person{
     private String dept,degree,university; 
    public Teachers(String name, String address, String number){
        super(name,address,number);
    }
    public Teachers(String name, String address, String number,String blood){
        super(name,address,number,blood);
        
        
    }
    
    public Teachers(String name, String address, String number, String blood,String dept){
        this(name,address,number,blood);
        this.dept=dept;
    }
    public Teachers(String name, String address, String number, String blood,String dept,String degree){
        this(name,address,number,blood,dept);
        this.degree=degree;
        
    }
    
     public Teachers(String name, String address, String number, String blood,String dept,String degree,String university){
        this(name,address,number,blood,dept,degree);
        this.university=university;
        
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
     
     @Override
    public void DisplayInfo(){
       super.DisplayInfo();
         System.out.println("Department: "+dept);
         System.out.println("Degree: "+degree);
         System.out.println("University: " +university);
         System.out.print("\n");
    }

    
}
