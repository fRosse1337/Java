package Java_lesson6;

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
