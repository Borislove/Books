package philosophyofjava.chapter3;

//Округление
public class RoundingNumbers {
    public static void main(String[] args) {

        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("MathTest.round(above): " + Math.round(above));
        System.out.println("MathTest.round(below): " + Math.round(below));
        System.out.println("MathTest.round(fabove): " + Math.round(fabove));
        System.out.println("MathTest.round(fbelow):" + Math.round(fbelow));
    }
}
