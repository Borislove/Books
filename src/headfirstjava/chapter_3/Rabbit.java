package headfirstjava.chapter_3;

public class Rabbit {

    String name;
    public void run() {
        System.out.println("Кролик бежит");
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "name='" + name + '\'' +
                '}';
    }
}

class RabbitTestDrive {
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        Rabbit[] arr = new Rabbit[3];

        arr[0] = new Rabbit();
        arr[1] = new Rabbit();
        arr[2] = arr[0];

        rabbit.name = "Джо джо";
        rabbit.run();

        arr[0].name = "Джо джо";
        arr[0].run();

      //  System.out.println(arr.length);
        System.out.println(arr[0]);

        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
