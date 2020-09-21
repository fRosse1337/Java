package Java_lesson7;

public class Main {
    public static void main(String[] args) {
        System.out.println("List of cats: ");
        Cat[] x = {new Cat("Polo", 5), new Cat("Soyer", 3), new Cat("Masha", 12)};
        Plate plate = new Plate(100);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("***********************************************");
        System.out.println("increase food by 100");
        plate.increaseFood(100);
        System.out.println(plate);
        System.out.println("***********************************************");
        System.out.println("Cats take food:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}
