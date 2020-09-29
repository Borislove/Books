package philosophyofjava.chapter8;
//Статические методы не являются полиморфными.

class StaticSuper{
    public static String staticGet(){
        return "Базовая версия staticGet()";
    }
    public String dynamicGet(){
        return "базовая версия dynamicGet";
    }
}
public class StaticSub extends StaticSuper{
    public static String staticGet(){
        return "Производная версия staticGet()";
    }
    public String dynamicGet(){
        return "Производная версия dynamicGet()";
    }
}

