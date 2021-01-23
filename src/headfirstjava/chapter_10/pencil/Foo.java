package headfirstjava.chapter_10.pencil;

public class Foo {

    static int x;

    public void go() {
        System.out.println(x);
    }
}
/*

class Foo2{
     int x;  //не статическая

    public static void go(){
        System.out.println(x);
    }
}*/


/*class Foo3{
  final int x;  //нет инициализации

    public static void go(){
        System.out.println(x);
    }
}*/

class Foo4 {
    static final int x = 1;
    public static void go() {
        System.out.println(x);
    }
}

class Foo5{
    static final int x = 12;
    public void go(final int x){
        System.out.println(x);
    }
}

class Foo6{
    int x = 12;
    public static void go(final int x){  //статический метод
        System.out.println(x);
    }
}