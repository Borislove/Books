package headfirstjava.chapter_10;

import java.util.Locale;

public class TestFormats {

    public static void main(String[] args) {

// TODO: 22.01.2021 не выводит запятые
        String s = String.format("%,d", 100000);
        System.out.println(s);

        //LOCALE
        String test = String.format(Locale.ENGLISH,"%,d%n", 1000000);
        System.out.println(test);

        String str = String.format("Мне нужно исправить %.2f ошибки.", 34424.09822);
        System.out.println("str = " + str);

        String str1 = String.format("Мне нужно исправить %,.2f ошибки.", 423034.09845);
        System.out.println("str1 = " + str1);
    }
}
