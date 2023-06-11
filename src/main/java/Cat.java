package src.main.java;

/**
 * Klasa reprezentująca kota.
 */
public class Cat extends Pet {
    /**
     * Konstruktor klasy Cat.
     *
     * @param name imię kota
     * @param age  wiek kota
     */
    public Cat(String name, int age) {
        super(name, age);
    }

    /**
     * Metoda przesłonięta z klasy nadrzędnej Pet. Wyświetla dźwięk, jaki wydaje kot.
     */
    @Override
    public void speak() {
        System.out.println("Kot mówi miau");
    }
}
