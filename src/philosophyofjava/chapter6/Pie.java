package philosophyofjava.chapter6;

class Pie {
    void f() {
        System.out.println("Pie.f()");
    }
}

class Cake {
    public static void main(String[] args) {
        Pie x = new Pie();
        x.f();
    }
}
