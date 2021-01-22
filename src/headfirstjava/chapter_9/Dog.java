package headfirstjava.chapter_9;

//new это вызов конструктора
public class Dog extends Animal{

    private int size;

    //по умолчанию
    public Dog(){
        size = 34;
        System.out.println("Размер собаки в конструкторе по умолчанию = "+size);
    }

    public Dog(int s){
        size = s;
        System.out.println("Размер собаки в конструкторе = "+size);
    }

    public void setSize(int s){
        size = s;
    }

    public static void main(String[] args) {
        Dog d = new Dog(); //вывод параметров
       System.out.println(d);

        Dog d2 = new Dog(45);
        System.out.println(d2);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "size=" + size +
                '}';
    }
}
