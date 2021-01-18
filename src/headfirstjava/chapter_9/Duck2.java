package headfirstjava.chapter_9;

public class Duck2 {
    int size;

    public Duck2(int duckSize) {
        System.out.println("Кря");
        size = duckSize;
        System.out.println("Размер равен "+size);
    }

    //по умолчанию
    public Duck2() {
        size = 27;
    }

    public static void main(String[] args) {
        Duck2 d2 = new Duck2(32);

        Duck2 d3 = new Duck2();
    }
}
