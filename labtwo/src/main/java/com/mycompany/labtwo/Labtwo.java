
package com.mycompany.labtwo;


public class Labtwo {

    public static void main(String[] args) {
       
        Car mazdaMx5 = new Car(
                "Mazda MX-5",
                "Sports",
                2021,
                2,
                500
                );
        
        Car mazdaMx8 =  new Car(mazdaMx5);
        System.out.println(mazdaMx5.getInfo());
        System.out.println(  mazdaMx8.getInfo());
        
        
        System.out.println(mazdaMx5.hashCode());
        System.out.println(mazdaMx8.hashCode());
        
        Cng myCng = new Cng("cng",
                "abc",
                1999,
                1,
                200,
                3);
        System.out.println(myCng.getInfo());
    }
}
