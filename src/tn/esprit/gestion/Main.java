package tn.esprit.gestion;
import tn.esprit.gestion.entities.*;
import tn.esprit.gestion.entities.Dolphin;

public class Main {
    public static void main(String[] args) {

            zoo myzoo = new zoo("zoo", "bizert");
            myzoo.setName("zoo");
            Animal dog = new Animal("husky","mounir",-2,true);
            Animal cat = new Animal("furry","monjia",1,true);
try {
   myzoo.addAnimal(dog);
}catch (InvalidAgeException |ZooFullExeption i)
{System.out.println(i.getMessage());
}


        Aquatic dolphin = new Dolphin("dolphin","morad",2,true,"dar",14);
        Aquatic penguin = new Penguin("penguin","monji",2,true,"dar",14);

        myzoo.addAquaticAnimal(dolphin);
        myzoo.addAquaticAnimal(penguin);



        dolphin.swim();
        penguin.swim();
        myzoo.maxPenguinSwimmingDepth();
        System.out.println(myzoo);






    }
}