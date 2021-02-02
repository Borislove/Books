package headfirstjava.chapter_16;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String,Integer> scores = new HashMap<String, Integer>();

        scores.put("Ket",42);
        scores.put("Bert", 343);
        scores.put("Skayler", 400);

        System.out.println(scores);
        System.out.println(scores.get("Bert"));  //принимает ключ и возвращает значение
    }
}
