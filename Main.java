package ru.geekbrains.catch_the_drops;

public class Main {

    public static void main(String[] args) {
        ex2();
        System.out.println("a * (b + (c / d)) = " + ex3(1, 2, 3, 4));
        System.out.println(ex4(5, 8));
        ex5(-7);
        System.out.println(ex6(-1));
        ex7("Тимофей");
    }

    private static void ex2() {
        System.out.println("\nЗадание 2.");
        boolean b = false;
        byte bt = 0;
        char c = 'w';
        short s = 421;
        int i = 34;
        long l = 42354L;
        float f = 654.0f;
        double d = 43.32;
        System.out.println("Значение для типа boolean = " + b);
        System.out.println("Значение для типа byte = " + bt);
        System.out.println("Значение для типа char = [" + c + "]");
        System.out.println("Значение для типа short = " + s);
        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа long = " + l);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа double = " + d);
    }

    public static double ex3(double a, double b, double c, double d) {
        System.out.println("\nЗадание 3.");
        return a * (b + (c / d));
    }

    public static boolean ex4(int a, int b) {
        System.out.println("\nЗадание 3.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    public static void ex5(int a) {
        System.out.println("\nЗадание 4.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    public static boolean ex6(int a) {
        System.out.println("\nЗадание 5.");
        if (a < 0) return true;
        return false;
    }

    public static void ex7(String name) {
        System.out.println("\nЗадание 6.");
        System.out.println("Привет, " + name + "!");
    }
}
