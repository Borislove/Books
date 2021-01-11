package headfirstjava.chapter_4;

import java.util.Arrays;

public class TestDog {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public static void main(String[] args) {

        TestDog[] pets;
        pets = new TestDog[7];

        pets[0]=new TestDog();
        pets[1] = new TestDog();

        pets[0].setSize(30);
        int x = pets[0].getSize();

        pets[1].setSize(8);

        System.out.println(Arrays.toString(pets));

        System.out.println(x);

    }

    @Override
    public String toString() {
        return "TestDog{" +
                "size=" + size +
                '}';
    }
}

//[TestDog{size=30}, TestDog{size=8}, null, null, null, null, null]