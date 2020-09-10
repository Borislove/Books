package philosophyofjava.chapter5;

import java.util.Arrays;
import java.util.Random;

//Создание массива непримитивных объектов
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        System.out.println("Длина а = " + a.length);
        for (int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(500); //автоматическая упаковка
        System.out.println(Arrays.toString(a));
    }
}
