package tn.esprit.gestion.entities;

import java.util.Scanner;

public class Animal  {
    public String family;
  private String name;
  private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age<0)
            System.out.println("give proper age");
        Scanner scanner= new Scanner(System.in);
        age=scanner.nextInt();
        this.age = age;
    }

    public boolean isMammal;

    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
}
