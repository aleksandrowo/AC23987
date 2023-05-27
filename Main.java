public class Main {
    public static void main(String[] args) {
        System.out.println("=== === === abstract class Pet === === ===");

        Cat cat1 = new Cat("Bursztynek", 4);
        System.out.println(cat1.getName() + " is " + cat1.age + " ys. old.");
        cat1.speak();

        Cat cat2 = new Cat("Puszek", 3);
        System.out.println(cat2.getName() + " is " + cat2.age + " ys. old.");
        cat2.speak();

        Dog dog1 = new Dog("Brutus", 7);
        System.out.println(dog1.getName() + " is " + dog1.age + " ys. old.");
        dog1.speak();

        Dog dog2 = new Dog("Leo", 10);
        System.out.println(dog2.getName() + " is " + dog2.age + " ys. old.");
        dog2.speak();

        Person P1 = new Person("Alicja Śliczna");
        P1.setPet(cat1);
        Person P2 = new Person ("Piotr Śliczny");
        P2.setPet(cat1);
        System.out.println(P1.getPet().name + " ma opiekuna " + P1.name + " oraz " + P2.name);
    }
}