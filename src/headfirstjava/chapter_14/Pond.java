package headfirstjava.chapter_14;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//утка не сериализованна, будут ошибки
public class Pond implements Serializable {
    private Duck duck = new Duck();

    public static void main(String[] args) {
        Pond myPond = new Pond();
        try{
            FileOutputStream fs = new FileOutputStream("e:\\javadoc\\Pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(myPond);
            os.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

class Duck{

}