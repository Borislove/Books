package headfirstjava.chapter_14;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    public static void main(String[] args) {
        try{

            FileWriter writer = new FileWriter("e:\\javadoc\\foo.txt");
            writer.write("Прифет, фи!");
            writer.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
