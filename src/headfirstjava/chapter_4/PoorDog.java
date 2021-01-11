package headfirstjava.chapter_4;

public class PoorDog {

    private int size;
    private String name;


    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}

class PoorDogTestDrive {
    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.println("Размер собаки - " + one.getSize());   //int default 0
        System.out.println("Имя собаки - " + one.getName()); //ссылка null, ссылка есть нет объекта
    }
}


/*Размер собаки - 0
Имя собаки - null
*/