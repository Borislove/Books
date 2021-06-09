package Java_for_Kids.chapter_9;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteReader {
    public static void main(String[] args) {
        FileInputStream myFile = null;
        try {
// Открытие байтового потока, указывающего на файл

            //myFile = new FileInputStream("c:\\temp\\abc.gif");
            myFile = new FileInputStream("C:\\Users\\User\\Desktop\\gifka\\dots.gif");
            while (true) {
                int intValueOfByte = myFile.read();
                System.out.print(" " + intValueOfByte);
                if (intValueOfByte == -1) {
                    // достигнут конец файла нужно выйти из цикла
                    break;
                }
            } // конец цикла while
            // myFile.close(); не помещайте этот вызов здесь
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл: "
                    + e.toString());
        } finally {
            try {
                myFile.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            System.out.println(
                    "Чтение файла завершено успешно");
        }
    }
}
