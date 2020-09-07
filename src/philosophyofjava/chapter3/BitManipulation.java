package philosophyofjava.chapter3;

import java.util.Random;

public class BitManipulation {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();

        printBinaryInt("-1", -1);
        printBinaryInt("+1", +1);
        int maxpos = 2147483647;
        printBinaryInt("максимальное положительное", maxpos);
        int maxneg = -2147483648;
        printBinaryInt("максимальное отрицательное", maxneg);
        printBinaryInt("i", i);
        printBinaryInt("~i", ~i);
        printBinaryInt("-i", -i);
        printBinaryInt("j", j);
        printBinaryInt("i & j", i & j);
        printBinaryInt("i | j", i | j);
        printBinaryInt("i ^ j", i ^ j);
        printBinaryInt("i << 5", i << 5);
        printBinaryInt("i >> 5", i >> 5);
        printBinaryInt("(~i) >> 5", (~i) >> 5);
        printBinaryInt("i >>> 5 ", i >>> 5);
        printBinaryInt("(~i) >>> 5", (~i) >>> 5);

        long l = rand.nextLong();
        long m = rand.nextLong();
        printBinaryLong("-1L", -1L);
        printBinaryLong("+1L", +1L);
        long ll = 9223372036854775807L;
        printBinaryLong("максимальное положительное", ll);
        long lln = -9223372036854775808L;
        printBinaryLong("максимальное отрицательное", lln);
        printBinaryLong("1", l);
        printBinaryLong("~1", ~1);
        printBinaryLong("-1", -1);
        printBinaryLong("m", m);
        printBinaryLong("l & m", l & m);
        printBinaryLong("l | m ", l | m);
        printBinaryLong("l ^ m ", l ^ m);
        printBinaryLong("l << 5", l << 5);
        printBinaryLong("l >> 5", l >> 5);
        printBinaryLong("(~1) >> 5", (~l) >> 5);
        printBinaryLong("l >>> 5", l >>> 5);
        printBinaryLong("(~1) >>> 5", (~l) >>> 5);
    }

    static void printBinaryInt(String s, int i) {
        System.out.println(s + ", int: " + i + ", двоичное: \n   " + Integer.toBinaryString(i));
    }

    static void printBinaryLong(String s, long l) {
        System.out.println(s + ", long: " + l + ",двоичное: \n   " + Long.toBinaryString(l));
    }
}
