package Java_for_Kids.chapter_10.pet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FishMaster_input {
    public static void main(String[] args) {
        Fish myFish = new Fish(20);
        String feetString = "";
        int feet;
        // Создаем обработчик чтения входного потока InputStreamReader,
        // который подключен к System.in и передаем его буферизованному
        // обработчику чтения BufferedReader
        BufferedReader stdin = new BufferedReader
                (new InputStreamReader(System.in));
        // Погружаемся несколько раз пока пользователь не нажмет
        // клавишу "Q"
        while (true) {
            System.out.println("Готова к погружению. На какую глубину?");
            try {
                feetString = stdin.readLine();
                if (feetString.equals("Q")) {
                // Выход из программы
                    System.out.println("Пока!");
                    System.exit(0);
                } else {
                    // Преобразуем feetString в целое число и погружаемся
                    // на глубину, которая определяется переменной feet
                    feet = Integer.parseInt(feetString);
                    myFish.dive(feet);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } // Конец while
    } // Конец main
}

