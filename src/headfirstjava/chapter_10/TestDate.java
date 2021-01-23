package headfirstjava.chapter_10;

import java.util.Date;

public class TestDate {

    public static void main(String[] args) {

        //полное представлянеие даты и времени
        System.out.println(String.format("%tc", new Date()));

        //просто время
        System.out.println(String.format("%tr",new Date()));

        Date today = new Date();
        System.out.println(String.format("%tA, %tB %td",today,today,today ));
    }
}
