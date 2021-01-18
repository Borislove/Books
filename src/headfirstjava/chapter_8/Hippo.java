package headfirstjava.chapter_8;

public class Hippo extends Animal {
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        super.sleep();
    }
}
