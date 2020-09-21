package Java_lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    @Override
    public String toString() {
        return "Cat: " + name + " | appetite " + appetite + " | is Full " + isFull;
    }

    void eat(Plate plate) {
        if (plate.getAmountOffFood() > appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }
}
