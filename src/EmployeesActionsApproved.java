import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeesActionsApproved extends TextFields {
    public DefaultTableModel tableModel;
    public JTable jtable;
    public JPanel jpanelButton = new JPanel();
    public JButton button1 = new JButton("Добавить");
    public JButton button2 = new JButton("Удалить");
    public JButton button3 = new JButton("Изменить");

    public EmployeesActionsApproved() {

        //добавляем данные в таблицу
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String[] addData = {textfield1.getText(), textfield2.getText(), textfield3.getText(), textfield4.getText(), textfield5.getText(),
                        textfield6.getText(), textfield7.getText(), textfield8.getText(),
                        textfield9.getText(), textfield10.getText(), textfield11.getText(),};//получаем содержимое текстового поля
                tableModel.addRow(addData);//добавляем содержимое текстового поля посденей строкой
                textfield1.setText(null);//после добавления делаем поля снова пустыми
                textfield2.setText(null);
                textfield3.setText(null);
                textfield4.setText(null);
                textfield5.setText(null);
                textfield6.setText(null);
                textfield7.setText(null);
                textfield8.setText(null);
                textfield9.setText(null);
                textfield10.setText(null);
                textfield11.setText(null);
            }
        });
        jpanelButton.add(button1);

        //удаление строки
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int row = jtable.getSelectedRow();//получаем индекс выбранной строки
                if (row != -1) {
                    tableModel.removeRow(row);//удаляем строку из таблицы
                }
            }
        });
        jpanelButton.add(button2);

        //меняем содержимое выбранной строки таблицы
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int row = jtable.getSelectedRow();//выбираем строку выделением
                if (row != -1) {
                    tableModel.setValueAt(textfield1.getText(), row, 0);//меняем содержимое выделенной строки
                    tableModel.setValueAt(textfield2.getText(), row, 1);
                    tableModel.setValueAt(textfield3.getText(), row, 2);
                    tableModel.setValueAt(textfield4.getText(), row, 3);
                    tableModel.setValueAt(textfield5.getText(), row, 4);
                    tableModel.setValueAt(textfield6.getText(), row, 5);
                    tableModel.setValueAt(textfield7.getText(), row, 6);
                    tableModel.setValueAt(textfield8.getText(), row, 7);
                    tableModel.setValueAt(textfield9.getText(), row, 8);
                    tableModel.setValueAt(textfield10.getText(), row, 9);
                    tableModel.setValueAt(textfield11.getText(), row, 10);
                }
            }
        });
        jpanelButton.add(button3);
    }
}