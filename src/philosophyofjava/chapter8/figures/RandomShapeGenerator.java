package philosophyofjava.chapter8.figures;

import java.util.Random;

//"Фабрика", случайным образом создающая объекты:
public class RandomShapeGenerator {
    private Random rand = new Random();

    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}
