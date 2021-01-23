package headfirstjava.chapter_10;

//
public class MathTest {

    static float value = 42.30f;

    public static float test(float f) {
        return Math.round(f);
    }

    public static void main(String[] args) {

        //минимальное значение
        int y = Math.min(56, 12);
        //System.out.println("y = " + y);

        //абсолютное значение числа
        int z = Math.abs(-343);
        //System.out.println("z = " + z);

        //округление
        int x1 = Math.round(42.2f); // float? //округление
        //System.out.println("x1 = " + x1);

        //
        for (int i = 0; i <= 100; i++) {
          //test(value);
            System.out.println(test(value));
        }
    }
}
