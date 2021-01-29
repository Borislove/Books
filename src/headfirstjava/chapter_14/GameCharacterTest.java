package headfirstjava.chapter_14;

import java.io.*;

public class GameCharacterTest implements Serializable {
    int power ;
    String type ;

    public GameCharacterTest(int power, String type) {
        this.power = power;
        this.type = type;
    }

    public static void main(String[] args) throws IOException {
        FileOutputStream fileStream = new FileOutputStream("e:\\javadoc\\MyGame.ser");
        ObjectOutputStream os = new ObjectOutputStream(fileStream);

        GameCharacterTest characterOne = new GameCharacterTest(20,"bot_1");
        os.writeObject(characterOne);

        GameCharacterTest characterTwo = new GameCharacterTest(30,"bot_2");
        os.writeObject(characterTwo);

        GameCharacterTest characterThree = new GameCharacterTest(40,"bot_3");
        os.writeObject(characterThree);
        os.close();
    }
}
