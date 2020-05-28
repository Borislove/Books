package headfirstjava;

public class Testing {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        while (x < 5) {

            ////////////////////
            //11 34 59
            x++;
            y = y + x;
            ////////////////////
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
