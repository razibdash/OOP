
package com.mycompany.ooplabone;


public class Animal {
   static Animal heaviest(Animal... animals) {
        // consider first element as largest
        Animal heaviestAnimal = animals[0];
        for (Animal anim : animals) {
            if (anim.weight > heaviestAnimal.weight) {
                heaviestAnimal = anim;
                // if current object has a larger weight
                // than heaviest, then it is the heaviest
            }
        }
        return heaviestAnimal;
    }

    private String name, family, sound;
    private double weight, height;
    private boolean hasTail;
   
    // use of ternary operator
    static void sameFamily(Animal a1, Animal a2) {
        String familyStatus = a1.family == a2.family ? "Same family" : "Different family";
        System.out.println(familyStatus);
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String kingdom) {
        this.family = kingdom;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public Animal(Animal a) {
        this(a.name, a.family, a.sound, a.weight, a.height, a.hasTail);
    }
   
    public Animal(String name, String family, String sound, double weight, double height, boolean hasTail) {
        this.name = name;
        this.family = family;
        this.sound = sound;
        this.weight = weight;
        this.height = height;
        this.hasTail = hasTail;
 
}
}
