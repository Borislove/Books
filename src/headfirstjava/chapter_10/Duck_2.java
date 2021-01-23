package headfirstjava.chapter_10;

public class Duck_2 {

    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

        //статический метод не видит состояние полей
//        System.out.println("Размер утки равен" +getSize());  // private
    }
}

