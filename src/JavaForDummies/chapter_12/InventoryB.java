package JavaForDummies.chapter_12;

import java.text.NumberFormat;
import java.util.Scanner;

public class InventoryB {
    public static void main(String[] args) {
        final double boxPrice = 3.25;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Сколько коробок вы насчитали? ");
        String numBoxesIn = keyboard.next();

        try {
            int numBoxes = Integer.parseInt(numBoxesIn);
            System.out.println("Общая стоимость равна ");
            System.out.println(currency.format(numBoxes*boxPrice));

        }catch (NumberFormatException e){
            System.out.println("Это не целое число");
        }
    }
}
