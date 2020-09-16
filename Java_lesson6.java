abstract class Animal {
    private final int MAX_RUN_LENGHT = 0;
    private final int MAX_SWIM_LENGHT = 0;
    private final double MAX_JUMP_HEIGHT = 0;

    abstract void run(int lenght);

    abstract void swim(int lenght);

    abstract void jump(double height);
}

class Cat extends Animal {
    private final int MAX_RUN_LENGHT = 200;
    private final double MAX_JUMP_HEIGHT = 2;

    @Override
    void run(int lenght) {
        if ((lenght >= 0) && (lenght <= MAX_RUN_LENGHT)) System.out.println("Cat run: true ");
        else System.out.println("Cat run: false ");
    }

    @Override
    void swim(int lenght) {
        System.out.println("Cat swim: false ");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= MAX_JUMP_HEIGHT)) System.out.println("Cat jump: true ");
        else System.out.println("Cat jump: false ");
    }
}

class Dog extends Animal {
    private final int MAX_RUN_LENGHT = 500;
    private final int MAX_SWIM_LENGHT = 10;
    private final double MAX_JUMP_HEIGHT = 0.5;

    @Override
    void run(int lenght) {
        if ((lenght >= 0) && (lenght <= MAX_RUN_LENGHT)) System.out.println("Dog run: true ");
    }

    @Override
    void swim(int lenght) {
        if ((lenght >= 0) && (lenght <= MAX_SWIM_LENGHT)) System.out.println("Dog swim: true ");
        else System.out.println("Dog swim: false ");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= MAX_JUMP_HEIGHT)) System.out.println("Dog jump: true ");
        else System.out.println("Dog jump: false ");
    }
}

public class Java_lesson6 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(201);
        cat.swim(1);
        cat.jump(1.9);


        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);
        dog.jump(0.4);
    }
}
