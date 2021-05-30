package JavaForDummies.chapter_15.gameapplet;

import javax.swing.*;

public class GameApplet extends JApplet {
    private  static  final long serialVersionUID = 1L;

    public void init(){
        setContentPane(new GamePanel());
    }
}
