package Java_lesson7;

public class Plate {
    private int amountOffFood;

    Plate(int amountOffFood) {
        this.amountOffFood = amountOffFood;
    }

    @Override
    public String toString() {
        return "Plate: " + amountOffFood;
    }

    void decreaseFood(int appetite) {
        if (amountOffFood >= appetite) {
            amountOffFood -= appetite;
        }
    }

    int getAmountOffFood() {
        return amountOffFood;
    }

    void increaseFood(int amount) {
        amountOffFood += amount;
    }
}
