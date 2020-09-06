package philosophyofjava.chapter2.task2;

public class Task8 {

    int a;
    int b;
    int c;

    static int d;

    public static void main(String[] args) {

        System.out.println(d);  //0
        Task8.d++;
        System.out.println(d);

        Task8 task8 = new Task8();
        task8.a = 100;
        task8.a--;
        System.out.println(task8.a);
    }
}
