package src.main.java;

/**
 * Klasa reprezentująca osobę.
 */
public class Person {
    String name;
    Pet pet;

    /**
     * Konstruktor klasy Person.
     *
     * @param name imię osoby
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Metoda zwracająca zwierzę towarzyszące osobie.
     *
     * @return zwierzę towarzyszące osobie
     */
    public Pet getPet() {
        return pet;
    }

    /**
     * Metoda ustawiająca zwierzę towarzyszące osobie.
     *
     * @param pet zwierzę towarzyszące osobie
     */
    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
