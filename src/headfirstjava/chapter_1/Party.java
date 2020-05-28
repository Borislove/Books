package headfirstjava.chapter_1;

import java.awt.*;

//стр. 33
public class Party {

    public static void buildinvite() {
        Frame f = new Frame();

        Label l = new Label("Вечеринка у Тима");
        Button b = new Button("Ваша ставка");
        Button c = new Button("Сбросить");
        Panel p = new Panel();

        //фрейм + панель
        f.add(p);
        //на панель кнопочки и лейб
        p.add(l);
        p.add(b);
        p.add(c);
        //размеры
        f.setSize(300, 200);
        //упаковка - компоновка
        f.pack();
        //центр
        f.setLocationRelativeTo(null);
        //видимость окна
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Party.buildinvite();
    }
}

