package headfirstjava.chapter_4;

public class TestStuff_1 {

    void go() {
        TestStuff_1 t = new TestStuff_1();
        int foo = 7;
        int bar = 3;
        t.takeTwo(foo, bar);
    }

    void takeTwo(int x, int y) {
        int z = x + y;
        System.out.println("Сумма равна " + z);
    }

    public static void main(String[] args) {


        TestStuff_1 t = new TestStuff_1();
        t.go();

        t.takeTwo(32, 39);
    }
}

