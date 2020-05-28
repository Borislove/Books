package headfirstjava.Example;

abstract class Shape {

    public void rotate() {
        System.out.println("Повернуть на 360°");
    }

    public static void playSound() {
        System.out.println("Воспроизвести звук");
    }

    public static void name(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.name("Circle");

        Square square = new Square();
        square.name("Square");

        Triangle triangle = new Triangle();
        triangle.name("Triangle");
        triangle.rotate();
        triangle.playSound();

        Amoeba amoeba = new Amoeba();
        amoeba.name("Amoeba");
        amoeba.rotate();
    }
}
