package headfirstjava.chapter_12;

public class MyOuter {
    private int x;
    MyInner inner = new MyInner();

    public void doStuff() {
        inner.go();  //вызываем метод внутренного класса
    }

    class MyInner {
        void go() {
            x = 42; //использует переменную экземпляра внешнего класса
        }
    }
}
