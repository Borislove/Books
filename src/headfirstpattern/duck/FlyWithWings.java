package headfirstpattern.duck;

//Реализация поведения для уток, которые умеют летать...
public class FlyWithWings implements FlyBehavior {

    public void fly() {
        System.out.println("I'm flying!!");
    }
}
