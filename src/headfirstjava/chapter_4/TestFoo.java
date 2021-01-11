package headfirstjava.chapter_4;

public class TestFoo {

    static int a = 3;
    static byte b =3;

    public static void main(String[] args) {
/*
        if(a==b) {
            System.out.println(a==b); //true
            System.out.print("a==b");
        }*/

        TestFoo a = new TestFoo();
        TestFoo b = new TestFoo();
        TestFoo c = a;

        //проверка битов
        System.out.println(a==b); //false
        System.out.println(a==c); //true
        System.out.println(b==c); //false



    }
}
