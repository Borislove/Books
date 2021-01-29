package headfirstjava.chapter_14;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class GameLoadTest {
    public static void main(String[] args) {

        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("e:\\javadoc\\Game.ser"));
            GameCharacter oneRestore = (GameCharacter)is.readObject();
            GameCharacter twoRestore = (GameCharacter)is.readObject();
            GameCharacter threeRestore = (GameCharacter)is.readObject();

            System.out.println("Тип первого: "+oneRestore.getType());
            System.out.println("Тип второго: "+twoRestore.getType());
            System.out.println("Тип третьего: "+threeRestore.getType());

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
