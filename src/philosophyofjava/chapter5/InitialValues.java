package philosophyofjava.chapter5;

//Вывод начальных значений, присваиваемых по умолчанию.
public class InitialValues {
    boolean t;
    char c;  //нуль символ, в виде пробела
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;

    void printInitialValue() {
        System.out.println("Тип данных       Начальное значение");
        System.out.println("boolean          " + t);
        System.out.println("char             [" + c + "]");
        System.out.println("byte             " + b);
        System.out.println("short            " + s);
        System.out.println("int              " + i);
        System.out.println("long             " + l);
        System.out.println("float            " + f);
        System.out.println("double           " + d);
        System.out.println("reference        " + reference);
    }

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValue();
        /*Тут возможен следующий вариант:
        new InitialValues().printInitialValues();
        * */
    }
}
