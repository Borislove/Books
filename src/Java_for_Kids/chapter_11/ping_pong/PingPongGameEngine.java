package Java_for_Kids.chapter_11.ping_pong;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PingPongGameEngine implements MouseListener, MouseMotionListener, GameConstants {
    PingPongGreenTable table;
    public int kidRacket_Y = KID_RACKET_Y_START;

    // Конструктор. Содержит ссылку на объект стола
    public PingPongGameEngine(PingPongGreenTable greenTable) {
        table = greenTable;
    }

    // Обязательные методы из интерфейса MouseListener
    public void mousePressed(MouseEvent e) {
        // Взять X и Y координаты указателя мыши
        // и установить их "белой точке" на столе
        table.point.x = e.getX();
        table.point.y = e.getY();
        // Внутри вызывает метод paintComponent()и обновляет окно
        table.repaint();
    }

    public void mouseReleased(MouseEvent e) {
    }

    ;

    public void mouseEntered(MouseEvent e) {
    }

    ;

    public void mouseExited(MouseEvent e) {
    }

    ;

    public void mouseClicked(MouseEvent e) {
    }

    ;

    // Обязательные методы из интерфейса MouseMotionListener
    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
        int mouse_Y = e.getY();
        // Если мышь находится выше ракетки ребенка
        // и не выходит за пределы стола –
        // передвинуть ее вверх, в противном случае – опустить вниз
        if (mouse_Y < kidRacket_Y && kidRacket_Y > TABLE_TOP) {
            kidRacket_Y -= RACKET_INCREMENT;
        } else if (kidRacket_Y < TABLE_BOTTOM) {
            kidRacket_Y += RACKET_INCREMENT;
        }
        // Установить новое положение ракетки
        table.setKidRacket_Y(kidRacket_Y);
        table.repaint();
    }
}

