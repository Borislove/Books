package headfirstjava.chapter_4;

//Переменные экземпляра объявляются внутри класса, но за пределеами метода.л
public class Horse {
    private double height = 15.2;
    private String breed;
}

//Локальные переменные объявляются внутри метода.
class AddThing {
    int a;
    int b = 12;

    public int add() {
        int toral = a + b;
        return toral;
    }
}

//Локальные переменные перед использованием нужно инициализировать!
class Foo {
    public void go() {
        int x = 1;
        int z = x + 3;
    }
}
