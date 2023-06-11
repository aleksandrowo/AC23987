package src.main.java;

/**
 * Klasa reprezentująca zwierzę.
 */
public class Pet {
    String name;
    int age;

    /**
     * Konstruktor klasy Pet.
     *
     * @param name imię zwierzęcia
     * @param age  wiek zwierzęcia
     */
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Metoda abstrakcyjna, która powinna być przesłonięta w klasach pochodnych.
     * Wyświetla dźwięk, jaki wydaje zwierzę.
     */
    public void speak() {
        // Implementacja zostanie dostarczona w klasach pochodnych
    }

    /**
     * Metoda zwracająca imię zwierzęcia.
     *
     * @return imię zwierzęcia
     */
    public String getName() {
        return name;
    }

    /**
     * Metoda ustawiająca imię zwierzęcia.
     *
     * @param name imię zwierzęcia
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metoda zwracająca wiek zwierzęcia.
     *
     * @return wiek zwierzęcia
     */
    public int getAge() {
        return age;
    }

    /**
     * Metoda ustawiająca wiek zwierzęcia.
     *
     * @param age wiek zwierzęcia
     */
    public void setAge(int age) {
        this.age = age;
    }
}
