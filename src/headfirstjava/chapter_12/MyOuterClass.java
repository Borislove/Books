package headfirstjava.chapter_12;

//внутренний класс использует переменную внешнего класса
public class MyOuterClass {
    private int x;

    class MyInnerClass {
        void go() {
            x = 42;
        }
    }
}
