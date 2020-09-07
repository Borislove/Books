package philosophyofjava.chapter3;

import java.util.Random;

//Демонстрация математических операций.
public class MathOps {
    public static void main(String[] args) {
        //Создание и раскрутка генератора случайных чисел
        Random rand = new Random(47);
        int i, j, k;
        //Выбор значения от 1 до 100:
        j = rand.nextInt(100) + 1;
        System.out.println("j = " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k = " + k);
        i = j + k;
        System.out.println("j + k  = " + i);
        i = j - k;
        System.out.println("j - k  = " + i);
        i = k / j;
        System.out.println("k / j  = " + i);
        i = k * j;
        System.out.println("k * j = " + i);
        i = k % j;
        System.out.println("k % j = " + i);
        j %= k;
        System.out.println("j %/ k :  = " + j);

        //Тесты для вещественных чисел
        float u, v, w; //также можно использовать double
        v = rand.nextFloat();
        System.out.println("u = " + v);
        w = rand.nextFloat();
        System.out.println("w = " + w);
        u = v + w;
        System.out.println("v + w = " + u);
        u = v - w;
        System.out.println("v - w = " + u);
        u = v * w;
        System.out.println("v * w = " + u);
        u = v / w;
        System.out.println("v / w = " + u);

        //следующее также относится к типам
        //char, byte, short, int, long и double:

        u += v;
        System.out.println("u +=v : " + u);
        u -= v;
        System.out.println("u -=v :" + u);
        u *= v;
        System.out.println("u *=v : " + u);
        u /= v;
        System.out.println("u /=v : " + u);
    }
}
