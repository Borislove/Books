package Java_for_Kids.chapter_10.pet;

public class Fish extends Pet {

    int currentDepth = 0;
    final int DEFAULT_DIVING = 5;

    public int getCurrentDepth() {
        return currentDepth;
    }

    public void setCurrentDepth(int currentDepth) {
        this.currentDepth = currentDepth;
    }

    public int dive() {
        currentDepth = currentDepth + DEFAULT_DIVING;
        if (currentDepth > 100) {
            System.out.println("Я маленькая рыбка и " +
                    " не могу нырять глубже 100 метров");
            currentDepth = currentDepth - DEFAULT_DIVING;
        } else {
            System.out.println("Погружаюсь на " +
                    DEFAULT_DIVING + " м");
            System.out.println("Я на " + currentDepth +
                    " метров ниже уровня моря");
        }
        return currentDepth;
    }

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        if (currentDepth > 100) {
            System.out.println("Я маленькая рыбка и " +
                    " не могу нырять глубже 100 метров");
            currentDepth = currentDepth - howDeep;
        } else {
            System.out.println("Погружаюсь на " + howDeep + " м.");
            System.out.println("Я на " + currentDepth +
                    " м. ниже уровня моря");
        }
        return currentDepth;
    }

    public String say(String something) {
        return "Ты не знаешь, что рыбы не умеют говорить?";
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(float weight) {
        super.setWeight(weight);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    // constructor
    public Fish(int startingPosition) {
        currentDepth = startingPosition;
    }
}


