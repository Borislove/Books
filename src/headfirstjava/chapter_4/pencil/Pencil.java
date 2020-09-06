package headfirstjava.chapter_4.pencil;

public class Pencil {

    // int a = calcArea(7, 12);

    int calcArea(int height, int width) {
        return height * width;
    }

    public static void main(String[] args) {

        Pencil p = new Pencil();
        System.out.println(p.calcArea(7, 12));

        short c = 7;
        System.out.println(p.calcArea(c, 12));


        long t = 42;
     //   System.out.println(p.calcArea(t,12));    // LONG!!!
    }
}
