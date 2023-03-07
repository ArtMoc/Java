import javax.swing.*;

public class TextFields extends JFrame {
    public JPanel jpanelTextField = new JPanel();
    public JTextField textfield1;
    public JTextField textfield2;
    public JTextField textfield3;
    public JTextField textfield4;
    public JTextField textfield5;
    public JTextField textfield6;
    public JTextField textfield7;
    public JTextField textfield8;
    public JTextField textfield9;
    public JTextField textfield10;
    public JTextField textfield11;

    public TextFields(){

        //создаем лейблы и текстовые поля для заполнения
        jpanelTextField.add(new JLabel("Фамилия: "));
        jpanelTextField.add(textfield1 = new JTextField("", 15));

        jpanelTextField.add(new JLabel("Имя: "));
        jpanelTextField.add(textfield2 = new JTextField("", 15));

        jpanelTextField.add(new JLabel("Отчество: "));
        jpanelTextField.add(textfield3 = new JTextField("", 15));

        jpanelTextField.add(new JLabel("Дата рождения: "));
        jpanelTextField.add(textfield4 = new JTextField("", 10));

        jpanelTextField.add(new JLabel("Пол: "));
        jpanelTextField.add(textfield5 = new JTextField("", 5));

        jpanelTextField.add(new JLabel("Телефон: "));
        jpanelTextField.add(textfield6 = new JTextField("", 10));

        jpanelTextField.add(new JLabel("Должность: "));
        jpanelTextField.add(textfield7 = new JTextField("", 15));

        jpanelTextField.add(new JLabel("Отдел: "));
        jpanelTextField.add(textfield8 = new JTextField("", 15));

        jpanelTextField.add(new JLabel("Зарплата: "));
        jpanelTextField.add(textfield9 = new JTextField("", 10));

        jpanelTextField.add(new JLabel("Начало работы: "));
        jpanelTextField.add(textfield10 = new JTextField("", 10));

        jpanelTextField.add(new JLabel("Начальник: "));
        jpanelTextField.add(textfield11 = new JTextField("", 15));
    }
}