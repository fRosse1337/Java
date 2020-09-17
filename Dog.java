package Java_lesson6;

public class Dog extends Animal {
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
