package headfirstjava.chapter_4;

public class Calc {

    static int calcArea(int height, int width) {
        System.out.println("height = " + height);
        System.out.println("width = " + width);
        System.out.println("height*width = " + height * width);
        return height * width;
    }

    public static void main(String[] args) {

        int a = calcArea(7, 12);
        short c = 7;
        calcArea(c, 15);

        calcArea(2, 3);

        byte h = (byte) calcArea(127, 20); //cast
        //byte b1 = 127;
    }
}
