package philosophyofjava.chapter2.task2;

public class Task6 {

    int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        Task6 task6 = new Task6();
//        task6.storage("Hello world");
        System.out.println(task6.storage("Hello world"));
    }
}
