package lesson3;

public class Bee extends Insect {
    Attac attac;

    public Bee(String color, double size) {
        super(color, size);
        attac=new AttackImpls("Sting","");

    }

    public Bee(String color, double size, Attac attac) {
        super(color, size);
        this.attac = attac;
    }
    public void attac(){
        attac.attack();
    }
    public void move() {
        attac.mouve();
    }
}