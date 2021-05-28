package Berd.chapter_11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//229.
//заполнение массива значениями
public class ShowGuests {

    public static void main(String[] args) throws IOException {

        int quests[] = new int[10];
        Scanner diskScanner = new Scanner(new File("src\\kettle\\GuestList.txt"));

        //считывает из файла количество постояльцев в каждой комнате
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            quests[roomNum] = diskScanner.nextInt();
        }
            System.out.println("Комната\tКоличество");

        //выводит содержимое
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            System.out.print(roomNum);
            System.out.print("\t");
            System.out.println(quests[roomNum]);
        }
    }
}

