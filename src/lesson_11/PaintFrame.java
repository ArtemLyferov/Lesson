package lesson_11;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PaintFrame extends Frame implements KeyListener {

    int x = 110;
    int y = 140;

    public PaintFrame() {
        this.setTitle("Форма для рисования");
        this.setSize(640,480);

        this.addWindowListener(new FrameListener2());
        this.addKeyListener(this);

        this.setVisible(true);
    }

    //Данный метод вызывается каждый раз, когда компонент перерисовывается
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawOval(10, 40, 200, 200);
        g.setColor(Color.GREEN);
        g.drawLine(x, y, 110, 240);
    }


    public static void main(String[] args) {
        new PaintFrame();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= 3;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += 3;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            y -= 3;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y += 3;
        }
        //Форсирует перерисовку компонента
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
