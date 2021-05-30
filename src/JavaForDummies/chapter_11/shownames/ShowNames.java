package JavaForDummies.chapter_11.shownames;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//стр. 247
//Использование коллекции Egg
public class ShowNames {

    public static void main(String[] args) throws IOException {

        ArrayList<String> people = new ArrayList<String>();
        Scanner diskScanner = new Scanner(new File("src\\kettle\\chapter_11\\shownames\\names.txt"));

        while (diskScanner.hasNext()) {
            people.add(diskScanner.nextLine());
        }

        people.remove(0);
        people.add(2, "Мезенцева Ольга");
        people.add(3, "Бугаев Максим");

        for (String name : people) {
            System.out.println(name);
        }
    }
}



