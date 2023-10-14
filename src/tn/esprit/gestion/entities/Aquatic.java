package tn.esprit.gestion.entities;

public class Aquatic extends Animal {
   public String habitat ;
   float swimspeed;
   float swmindeepth;
    public Aquatic(String family, String name, int age, boolean isMammal, float swimspeed, float swimindepth) {
        super(family, name, age, isMammal);
        this.swimspeed=swimspeed;
        this.swmindeepth=swimindepth;
    }
public void isswiming()
{
    System.out.println(family+"is swiming");
}

}
