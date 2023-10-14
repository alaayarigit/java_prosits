package tn.esprit.gestion;
import tn.esprit.gestion.entities.*;

public class Main {
    public static void main(String[] args) {

Animal lion = new Animal("lion","bohmid",5,true);
           zoo zooo =new zoo("zooo", "tunis");
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


       // Animal chien = new Animal("morad", "chien", 2, true);
       // System.out.println(myzoo.searchAnimal(lion));
       // System.out.println(myzoo.removeAnimal(chien));
        /* comparerzoo(myzoo,zooo); */
        //  myzoo.displayAnimals();
        Aquatic dolphin = new Aquatic("dolphin", "ali",6,false,25,20);
        Aquatic penguin = new Aquatic("penguin","joe",2,false,10,10);
        Aquatic a = new Aquatic("aquatic","aqua",0,false,0,0);
        dolphin.isswiming();
        penguin.isswiming();
        a.isswiming();


    }
}