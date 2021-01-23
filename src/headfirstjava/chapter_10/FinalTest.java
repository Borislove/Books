package headfirstjava.chapter_10;

public class FinalTest {
    //имена констант должны быть в верхнем регистре

    public static final int FOOOOOO = 25;

    //в статическом инициализаторе
    public static final double BAR_SIGN;

    //запуск сразу после загрузки класса
    static {
        BAR_SIGN = (double) Math.random();
    }
}
