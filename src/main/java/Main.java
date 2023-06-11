package src.main.java;
//import org.apache.commons.lang3.StringUtils;
/**
 * Główna klasa programu, demonstrująca działanie różnych klas.
 */
public class Main {
    /**
     * Metoda główna programu.
     *
     * @param args argumenty wiersza poleceń
     */
    public static void main(String[] args) {
        System.out.println("=== === === abstract class src.main.java.Pet === === ===");

        // Tworzenie obiektów kotów
        Cat cat1 = new Cat("Bursztynek", 4);
        System.out.println(cat1.getName() + " is " + cat1.age + " ys. old.");
        cat1.speak();

        Cat cat2 = new Cat("Puszek", 3);
        System.out.println(cat2.getName() + " is " + cat2.age + " ys. old.");
        cat2.speak();

        // Tworzenie obiektów psów
        Dog dog1 = new Dog("Brutus", 7);
        System.out.println(dog1.getName() + " is " + dog1.age + " ys. old.");
        dog1.speak();

        Dog dog2 = new Dog("Leo", 10);
        System.out.println(dog2.getName() + " is " + dog2.age + " ys. old.");
        dog2.speak();

        // Tworzenie obiektów osób i przypisywanie zwierząt
        Person P1 = new Person("Alicja Śliczna");
        P1.setPet(cat1);
        Person P2 = new Person("Piotr Śliczny");
        P2.setPet(cat1);
        System.out.println(P1.getPet().name + " ma opiekuna " + P1.name + " oraz " + P2.name);

        Person P3 = new Person("Janek Kowalski");
        P3.setPet(dog1);
        System.out.println(P3.getPet().name + " ma opiekuna " + P3.name);

        // Tworzenie obiektów klinik weterynaryjnych i przypisywanie zwierząt
        VetClinic vc1 = new VetClinic("Klinika zwierząt Vet");
        vc1.setPet(dog1);
        System.out.println(vc1.clinicName + " leczy psa " + vc1.getPet().name);

        VetClinic vc2 = new VetClinic("Klinika zwierząt Vet 2");
        vc2.setPet(cat1);
        System.out.println(vc2.clinicName + " leczy kota " + vc2.getPet().name);

//        if(StringUtils.isMixedCase(vc1.clinicName).isTrue()){
//            System.out.println("mixedCase");
//        }
    }
}
