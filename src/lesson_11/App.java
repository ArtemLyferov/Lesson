package lesson_11;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class App {

    public static void main(String[] args) {
        //Frame - основной класс графических приложений, представляет собой окно
        Frame frame = new Frame();

        //добавляем к окну слушателя его событий
        //frame.addWindowListener(new FrameListener());
        frame.addWindowListener(new FrameListener2());

        frame.setTitle("Окно на AWT"); //метод установки заголовка окна

        frame.setSize(640, 480);    //метод задания размеров

        frame.setVisible(true); //показать/скрыть окно

        //frame.addMouseWheelListener();

    }

}

/*
    Класс-слушатель событий окна (свернуто/развернуто, открыто/закрыто и т. п.)
 */
class FrameListener implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Окно открыто");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Окно пытаются закрыть");
        //e.getWindow() возвращает окно, являющееся источником события
        e.getWindow().dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Окно закрыто");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Окно свернуто");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Окно развернуто");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Окно активировано");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Окно деактивировано");
    }
}

/*
    Класс-слушатель событий окна (свернуто/развернуто, открыто/закрыто и т. п.)
    Но он наследуется от класса-адаптера, в котором все методы от интерфейсов-слушателей
    реализованы
 */
class FrameListener2 extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        e.getWindow().dispose();
    }
}
