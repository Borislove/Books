package philosophyofjava.chapter8;
//Нисходящее преобразование и динамическое определение типов (RTTI).
//{ThrowException}

class Userful {
    public void f() {
    }

    public void g() {
    }
}

class MoruUseful extends Userful {
    public void f() {
    }

    public void g() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }
}

public class RTTI {
    public static void main(String[] args) {
        Userful[] x = {
                new Userful(),
                new MoruUseful()
        };
        x[0].f();
        x[1].g();
        ((MoruUseful)x[1]).u(); //Нисходящее преобразование /RTTI
        ((MoruUseful)x[0]).u(); //Происходит исключение
    }
}
