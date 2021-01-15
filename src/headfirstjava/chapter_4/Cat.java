package headfirstjava.chapter_4;

public class Cat {

    void meow(int numOfMeows){
        while (numOfMeows>0) {
        System.out.println("Мяу!");
            numOfMeows = numOfMeows - 1;
        }
    }
}

class CatTestDrive{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow(3);
    }
}
