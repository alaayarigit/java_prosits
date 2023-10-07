package tn.esprit.gestion;
import tn.esprit.gestion.entities.Animal;
import zoo;

public class Main {
    public static void main(String[] args) {

Animal lion = new Animal("lion","bohmid",5,true);
            zoo myzoo = new zoo("zoo", "bizert");
            myzoo.setName("zoo");

        System.out.println("le "+myzoo.getName()+" va contenir "+ myzoo.nbrCages+" animaux maximum.");
        System.out.println("display using displayzoo()");
        myzoo.DisplayZoo("zoo","tunis",10);
        System.out.println("display with prosit");
        System.out.println(myzoo);
        System.out.println(myzoo.toString());
        System.out.println(myzoo.addAnimal(lion));


        myzoo.displayAnimals();


        Animal chien = new Animal("morad", "chien", 2, true);
        System.out.println(myzoo.searchAnimal(lion));
        System.out.println(myzoo.removeAnimal(chien));
        myzoo.displayAnimals();


    }
}