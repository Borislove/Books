package philosophyofjava.chapter2;

//: object/HelloDate.java

import java.util.Date;

/**
 * Первая программа - пример книги.
 * Выводит строку и текущее число.
 *
 * @author Брюс Эккель
 * @author www.MindView.net
 * @version 4.0
 */
public class HelloDate {
    /**
     * Точка входа в класс и приложение
     *
     * @param args Массив строковых аргументов
     *  // @throws exceptions Исключение не выдаются // TODO: 06.09.2020 подсвечивается красным 
     */
    public static void main(String[] args) {
        System.out.println("Привет, сегодя: ");
        System.out.println(new Date());
    }
} /* Output: (55% match
Привет, сегодя:
Sun Sep 06 20:32:34 MSK 2020
*///:~
