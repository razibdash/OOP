
package com.mycompany.ooplabone;

public class Ooplabone {

    public static void main(String[] args) {
         // Defining some animals
        Animal cat = new Animal("Tom","Felidae","Meow",4.5,45,true);
        Animal dog  = new Animal("Scooby Doo","Canidae","Woof",13.5,20,true);
        Animal panda = new Animal("Po", "Ursidae", "Kaaa", 550, 230, true);
        Animal lion = new Animal("Simba", "Felidae", "Roar", 250, 100, true);
        Animal parrot = new Animal("Mithu", "Aves", "Hello", 1.250, 10, true);
        Animal cockroach = new Animal("Dee Dee", "Insecta", "none", 0.02, 1, false);
       
        // Making a copy of cat called copyCat
        Animal copyCat = new Animal(cat);
        // Animal copyCat = cat;
        // ^ uncomment above line to see reference variant
        cat.setName("Joshim");
        System.out.println(cat.getName());
        System.out.println(copyCat.getName());
        System.out.println(copyCat.equals(cat));
       
        // varargs / variable length arguments
        Animal heaviestAnimal = Animal.heaviest(cat,dog,lion,cockroach,parrot,panda);
       
        System.out.println("The heaviest animal is "
                + heaviestAnimal.getName());
       
        // heaviestAnimal and panda are the same objects
        // they have the same reference
        System.out.println(heaviestAnimal.equals(panda));
        // if we change the name of heaviestAnimal
        // panda's name also changes, due to it having
        // the same memory address
        heaviestAnimal.setName("Big Panda");
        System.out.println(heaviestAnimal.getName());
        System.out.println(panda.getName());
       
        // same memory address
        System.out.println(panda.hashCode());
        System.out.println(heaviestAnimal.hashCode());
       
        // different address
        System.out.println(cat.hashCode());
        System.out.println(copyCat.hashCode());

    }
}
