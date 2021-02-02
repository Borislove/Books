package headfirstjava.chapter_16;

import java.util.ArrayList;

public class TestGenerics1 {
    public static void main(String[] args) {
        new TestGenerics1().go();
    }

    /*public void go(){
        Animal[] animals = {new Dog(), new Cat(),new Dog()};
        Dog[] dogs = {new Dog(), new Dog(),new Dog()};
        takeAnimals(animals);
        takeAnimals(dogs);
    }*/


    /*public void takeAnimals(Animal[] animals){
        for(Animal a : animals){
            a.eat();
            System.out.println(a.getClass());
        }
    }*/
    public void go() {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        takeAnimals(animals);
    }

    public void takeAnimals(ArrayList<Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }
}

abstract class Animal {
    void eat() {
        System.out.println("животное ест");
    }
}

class Dog extends Animal {
    static {
        System.out.println("Dog");
    }

    void bark() {
    }
}

class Cat extends Animal {
    static {
        System.out.println("Cat");
    }

    void meow() {
    }
}
