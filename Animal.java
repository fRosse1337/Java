package Java_lesson6;

abstract class Animal {
    private final int MAX_RUN_LENGHT = 0;
    private final int MAX_SWIM_LENGHT = 0;
    private final double MAX_JUMP_HEIGHT = 0;

    abstract void run(int lenght);

    abstract void swim(int lenght);

    abstract void jump(double height);
}
