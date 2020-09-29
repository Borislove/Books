package philosophyofjava.chapter8;

public class StaticPolymorphism{
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub(); //Восходящее преобразования
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
