
public class zoo {


    Animal[] animals;
    String name;
    String city;
   final int nbrCages=25;
    int nbrAnimals;
    public zoo (String name, String city) {

        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;


    }
     public  void DisplayZoo(String name,String city , int nbrCages)
     {
         System.out.println(name);
         System.out.println(city);
         System.out.println(nbrCages);

     }

    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (nbrAnimals == nbrCages)
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name))
                return i;
        }
        return index;
    }
    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

    boolean isZooFull() {
        int count = 0;

        for (Animal animals : animals) {
            count++;
        }
        if (count == nbrCages) return true;
        return false;
    }

    zoo comparerZoo(zoo z1, zoo z2) {
        int x = 0, y = 0;
        for (int i = 0; i < z1.nbrAnimals; i++) {
            x = i;
            System.out.println(i);
        }
        for (int j = 0; j < z2.nbrAnimals; j++) {
            y = j;
            System.out.println(j);
        }
        if (x < y) {
            return z2;
        } else {
            return z1;
        }
    }
    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ",  Cages: " + nbrCages;
    }

}
