package src.main.java;

/**
 * Klasa reprezentująca psa.
 */
public class Dog extends Pet {
    /**
     * Konstruktor klasy Dog.
     *
     * @param name imię psa
     * @param age  wiek psa
     */
    public Dog(String name, int age) {
        super(name, age);
    }

    /**
     * Metoda przesłonięta z klasy nadrzędnej Pet. Wyświetla dźwięk, jaki wydaje pies.
     */
    @Override
    public void speak() {
        System.out.println("Pies mówi hau hau :D");
    }
}
