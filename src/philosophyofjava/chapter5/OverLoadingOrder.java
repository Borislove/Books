package philosophyofjava.chapter5;

//Перегрузка, основанная на порядке следования аргументов.
public class OverLoadingOrder {
    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        System.out.println("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        f("Сначало строка", 11);
        f(99, "Сначало число");
    }
}
