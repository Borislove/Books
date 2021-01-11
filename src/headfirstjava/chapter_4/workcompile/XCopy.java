package headfirstjava.chapter_4.workcompile;

public class XCopy {

    public static void main(String[] args) {

        int orig = 42;
        XCopy x = new XCopy();

        int y = x.go(orig);

        System.out.println(orig + " " + y);  //42 + "" + go(42*2)
    }

    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
