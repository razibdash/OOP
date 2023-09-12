
package com.mycompany.ums;


public class Students extends Person{
    private String id,dept,batch,university;
    
    public Students(String name,String id, String dept, String batch){
        super(name);
        this.id=id;
        this.batch=batch;
        this.dept=dept;
    }
    public Students(String name,String id, String dept, String batch,String university){
       this(name,id,dept,batch);
       this.university=university;
    }
    
    public Students(String name, String address, String number, String blood,String id, String dept, String batch) {
        super(name, address, number, blood);
        this.id = id;
        this.dept = dept;
        this.batch = batch;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getBtach() {
        return batch;
    }

    public void setBtach(String batch) {
        this.batch = batch;
    }
    
    @Override
    public void DisplayInfo(){
        super.DisplayInfo();
        System.out.println("Id: "+id);
         System.out.println("Depertment: "+dept);
          System.out.println("Batch: "+batch);
          System.out.println("University: " +university);
          System.out.print("\n");
        
    }
    
}
