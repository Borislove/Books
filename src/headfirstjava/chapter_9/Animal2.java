package headfirstjava.chapter_9;

public abstract class Animal2 {

    private String name;

    public String getName() {
        return name;
    }

    public Animal2(String name) {
        this.name = name;
    }
}

class Hippo2 extends Animal2{

    public Hippo2(String name) {
        super(name);
    }
}

class MakeHippo{
    public static void main(String[] args) {

        Hippo2 h2 = new Hippo2("Baffi");
        System.out.println(h2.getName());
    }
}
