package headfirstjava.chapter_10;

public class Test_1 {

    public static void main(String[] args) {
        
        String s = "12";
        //преобразование строки в число
        int x = Integer.parseInt(s);
        System.out.println("x = " + x);
        
        double d = Double.parseDouble("222.222");
        System.out.println("d = " + d);
  /*
        
        String t = "три";
        int y = Integer.parseInt(t);
        System.out.println("y = " + y);  //NumberFormatException*/


        //преобразование число в объект String
        double dd = 42.5;
        String doubleString = ""+d; //конкатенацией
        System.out.println("doubleString = " + doubleString);

        double ddd = 42.5;
        String doubleString1 = Double.toString(ddd);
        System.out.println("doubleString1 = " + doubleString1);
    }
}
