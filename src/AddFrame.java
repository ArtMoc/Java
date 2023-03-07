import javax.swing.*;

public class AddFrame {
    public AddFrame() {
        setTittle("Учет сотрудников");//Заголовок окна
        setVisible(true); //делает окно видимым-невидимым
        setSize(1200, 600);//размеры окна
        setLocationRelativeTo(null);//окно по центру экрана
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//закрытие программы при нажатии на крестик
        setResizable(false);//разрешение пользователю изменять размер окна
    }

    private void setResizable(boolean b) {}
    private void setDefaultCloseOperation(int exitOnClose) {}
    private void setLocationRelativeTo(Object o) {}
    private void setSize(int width, int height) {}
    private void setVisible(boolean b) {}
    private void setTittle(String tittle) {}
}
