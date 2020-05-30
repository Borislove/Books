package headfirstjava.chapter_4;

public class TestStuff {

    void go() {
        TestStuff t = new TestStuff();
        t.takeTwo(12, 34);
    }

    void takeTwo(int x, int y) {
        int z = x + y;
        System.out.println("Сумма равна " + z);
    }

    public static void main(String[] args) {

        TestStuff t = new TestStuff();
        t.go();

        t.takeTwo(32, 39);
    }
}
