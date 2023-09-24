
public class zoo {


    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int nbrAnimals;
    public zoo (String name, String city, int nbrCages) {

        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;

    }
     public  void DisplayZoo(String name,String city , int nbrCages)
     {
         System.out.println(name);
         System.out.println(city);
         System.out.println(nbrCages);

     }
    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ",  Cages: " + nbrCages;
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



}
