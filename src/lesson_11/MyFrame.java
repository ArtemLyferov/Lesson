package lesson_11;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends Frame implements ActionListener {

    private TextArea textArea;

    private Button button;
    private MenuItem openMenuItem;

    public MyFrame() {

        this.setTitle("Компоненты AWT");
        this.setSize(640,480);

        this.addWindowListener(new FrameListener2());

        //Компоновка с 5 позициями (север, юг, запад, восток, центр)
        BorderLayout borderLayout = new BorderLayout();
        this.setLayout(borderLayout);

        //Сеточная компоновка
        //GridLayout gridLayout = new GridLayout(6, 8);
        //this.setLayout(gridLayout);


        //Статичная текствая метка
        Label label = new Label();
        label.setText("Класс Label предназачен для хранения текста");
        label.setAlignment(Label.CENTER);
        add(label);
        //add(label, BorderLayout.NORTH);

        //Кнопка
        button = new Button();
        button.setLabel("Отправить");
        //add(button);
        button.setName("Btn1");
        add(button, BorderLayout.SOUTH);
        button.addActionListener(this);

        //Флажок (да/нет)
        Checkbox checkbox = new Checkbox();
        checkbox.setLabel("Анонимно");
        checkbox.setState(true);    //изменить состояние флажка
        add(checkbox);

        Checkbox android = new Checkbox("Android");
        Checkbox ios = new Checkbox("iOS");
        //Класс для объединения нескольких флажков в группу,
        //чтобы среди них можно было выбрать только один вариант
        CheckboxGroup systems = new CheckboxGroup();
        android.setCheckboxGroup(systems);
        ios.setCheckboxGroup(systems);
        add(android);
        add(ios);

        //Однострочное текстовое поле
        TextField textField = new TextField();
        add(textField);
        textField.setEchoChar('*'); //на какой символ заменять все введенные

        //Многострочное текстовое поле
        textArea = new TextArea();
        add(textArea);

        //Список
        List list = new List();
        list.setMultipleMode(true); //разрешить выбор нескольких элементов
        list.add("Первый");
        list.add("Второй");
        list.add("Третий");
        //add(list);
        add(list, BorderLayout.EAST);

        //Компоновка, в которой все элементы идут друг за другом
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER);
        //this.setLayout(flowLayout); //сказать форме, чтобы она упорядочивала
        //элементы согласно выбранной компоновке

        //Заголовочное меню
        MenuBar menuBar = new MenuBar();
        //Пункт меню (в заголовочном они располагаются в строчку)
        Menu fileMenu = new Menu("Файл");
        openMenuItem = new MenuItem("Открыть");
        openMenuItem.setName("Open1");

        //Назначение горячей клавиши для меню
        MenuShortcut shortcut = new MenuShortcut(KeyEvent.VK_O);
        openMenuItem.setShortcut(shortcut);
        //Добавить слушателя на выбор пункта меню
        openMenuItem.addActionListener(this);

        MenuItem saveMenuItem = new MenuItem("Сохранить");
        MenuItem exitMenuItem = new MenuItem("Выйти");
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        Menu helpMenu = new Menu("Помощь");
        MenuItem aboutMenuItem = new MenuItem("Об авторе");
        helpMenu.add(aboutMenuItem);

        //Назначение меню компоненту
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        //Назначение меню форме
        this.setMenuBar(menuBar);
        //add(menuBar, BorderLayout.NORTH);

        this.setVisible(true);
    }




    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = e.getActionCommand();
        System.out.println(text);
        //Component source = (Component)e.getSource();
        //if (text.equals("Отправить")) {
        if (e.getSource() == button) {
            textArea.append("Нажата кнопка");
            textArea.append("\n");
        } else if (e.getSource() == openMenuItem) {
            textArea.append("Выбран пункт меню 'Открыть'");
            textArea.append("\n");
        }
    }
}

