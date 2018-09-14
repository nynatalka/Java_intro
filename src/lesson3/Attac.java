package lesson3;

public interface Attac {
    void attack();

    default void mouve() {
        System.out.print("Sting");
    }

}