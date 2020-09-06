package philosophyofjava.chapter2.task2;

public class task7 {

    static int x = 40;

    static void increment() {
        task7.x--;
    }

    public static void main(String[] args) {
        increment();
        System.out.println(x);
    }
}
