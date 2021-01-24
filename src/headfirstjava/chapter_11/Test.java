package headfirstjava.chapter_11;

//????
public class Test {

    public static void main(String[] args) {
        Foo x = new Foo();
        try {
            Foo f = x.doRiskyThing();
            int b = f.getNum();

        } catch (Exception e) {
            System.out.println("неудача");
        }
        System.out.println("мы это сделали");
    }
}

class Foo {
    int num = 10;
    public int getNum() {
        return num;
    }

    static Foo doRiskyThing(){
        return null;
    }
}
