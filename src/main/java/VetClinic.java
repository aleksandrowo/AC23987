package src.main.java;

/**
 * Klasa reprezentująca klinikę weterynaryjną.
 */
public class VetClinic {
    String clinicName;
    Pet pet;

    /**
     * Konstruktor klasy VetClinic.
     *
     * @param clinicName nazwa kliniki weterynaryjnej
     */
    public VetClinic(String clinicName) {
        this.clinicName = clinicName;
    }

    /**
     * Metoda zwracająca zwierzę przypisane do kliniki.
     *
     * @return zwierzę przypisane do kliniki
     */
    public Pet getPet() {
        return pet;
    }

    /**
     * Metoda ustawiająca zwierzę przypisane do kliniki.
     *
     * @param pet zwierzę przypisane do kliniki
     */
    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
