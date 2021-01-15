package headfirstjava.chapter_8;

public class MyDoList {

    private Dog[] dogs = new Dog[5];
    private int nextIndex = 0;

    public void add(Dog d) {
        if (nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            System.out.println("Dog добавлен в ячейку" + nextIndex);
            nextIndex++;
        }
    }

    public static void main(String[] args) {

    }
}


