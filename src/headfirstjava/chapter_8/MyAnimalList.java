package headfirstjava.chapter_8;

import java.util.ArrayList;

public class MyAnimalList {

    //создаем новый объект массива
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal добавлен в ячейку " + nextIndex);
            nextIndex++;
        }
    }
}

class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        list.add(a);
        list.add(c);

        //идентичные ли объекты?
        if (a.equals(c)) {
            System.out.println("true");
        } else
            System.out.println("false");

        //возвращает класс, экземпляр которого является объект
        System.out.println(c.getClass());

        //уникальный идентификатор
        System.out.println(c.hashCode());

        //вывод имени класса
        System.out.println(c.toString());

        //создаем лист для хранение объектов Dog
        ArrayList<Dog> myDogArrayList = new ArrayList<Dog>();
        Dog aDog = new Dog();
        myDogArrayList.add(aDog);
        Dog d = myDogArrayList.get(0);

        aDog.eat();
        c.eat();

        aDog.walk();
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("cat nyam nyam");
    }
}

class Dog extends Animal implements Walk{
    @Override
    public void eat() {
        System.out.println("dog nyam nyam");
    }

    @Override
    public void walk() {
        System.out.println("гулять");
    }
}

//должен реализовывать абстрактные методы в дочерних классах
abstract class Animal {
    public abstract void eat();
    public void sleep() {
        System.out.println("Animal sleep");
    }
}

interface Walk {
    void walk();
}

