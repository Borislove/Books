package headfirstjava.chapter_8;

import java.util.ArrayList;

public class DogTest {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.sleep();

        ArrayList<Animal> dogList = new ArrayList<Animal>();
        dogList.add(d);

        Hippo h = new Hippo();
        dogList.add(h);

        dogList.get(1).eat();

        System.out.println(h.toString());
        System.out.println(h.hashCode());
        System.out.println(h.getClass());
        System.out.println(h.equals(d));


        ArrayList<Object> objList = new ArrayList<Object>();

        objList.add(h);
        objList.add(d);

        System.out.println(objList.size());

        ((Animal) objList.get(1)).eat();  //приведение объекта к animal
    }
}
