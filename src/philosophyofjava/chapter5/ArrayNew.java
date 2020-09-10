package philosophyofjava.chapter5;

import java.util.Arrays;
import java.util.Random;

//Создание массивов оператором new.
public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println("Длина а = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
