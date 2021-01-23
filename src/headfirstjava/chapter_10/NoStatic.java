package headfirstjava.chapter_10;

//статический импорт
import static java.lang.StrictMath.sqrt;
import static java.lang.StrictMath.tan;
import static java.lang.System.out;

public class NoStatic {

    public static void main(String[] args) {

        System.out.println("sqrt " + Math.sqrt(2.0));
        System.out.println("tan " + Math.tan(60));
    }
}


class WithStatic {
    public static void main(String[] args) {
        out.println("sqr " + sqrt(2.0));
        out.println("tan " + tan(60));
    }
}
