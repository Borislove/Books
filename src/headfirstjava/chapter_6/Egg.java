package headfirstjava.chapter_6;

import java.util.ArrayList;

public class Egg {
    public static void main(String[] args) {

        ArrayList<Egg> myList = new ArrayList<Egg>();
        Egg s = new Egg();

        myList.add(s);

        Egg b =new Egg();
        myList.add(b);

        //узнать размер листа
        int theSize = myList.size();
        System.out.println("theSize = " + theSize);

        //содержит что либо?
        boolean isIn = myList.contains(s);
        System.out.println("isIn = " + isIn);

        int idx = myList.indexOf(b);
        System.out.println("idx = " + idx);

        //не пустой ли
        boolean empty = myList.isEmpty();
        System.out.println("empty = " + empty);

        myList.remove(s);
    }
}
