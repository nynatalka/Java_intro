package lesson3;

public class AttackImpls implements Attac {
    String attack;
    String move;

    public AttackImpls(String attack, String move) {
        this.attack = attack;
        this.move = move;
    }

    @Override
    public void attack() {
        System.out.print(attack+" and "+ attack);
    }
}
