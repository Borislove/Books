package Berd.chapter_4;

import static java.lang.System.out;

//стр.88 Вычисление времени в часах и минутах
public class MakeChange {

    public static void main(String[] args) {

        int totalTime = 200;  //общее время
        int hour, minute;

        hour = totalTime / 60;
        minute = totalTime % 60;
        out.println("Общее время = " + hour + " часа и " + minute
                + " минут.");
    }
}
