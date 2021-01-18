package headfirstjava.chapter_9;

public class Duck3 extends Animal{
    int size;

    //вызвать родительский конструктор - super
    public Duck3(int newSize) {
        super();
        size = newSize;
    }

    public static void main(String[] args) {

        Duck3 d3 = new Duck3(22);

        System.out.println(new Duck3(222));
    }

    @Override
    public String toString() {
        return "Duck3{" +
                "size=" + size +
                '}';
    }
}



