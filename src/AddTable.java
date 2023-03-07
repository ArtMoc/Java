import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class AddTable extends EmployeesActionsApproved {
    public JScrollPane jscrollpane = new JScrollPane();
    public Vector<String> dataTitle = new Vector<>();//название столбцов
    public Vector<Vector<String>> data = new Vector<>();//содержимое ячеек
    public AddTable() {
        setTitle("Учет сотрудников");//заголовок окна
        setSize(1200, 600);//размеры окна
        setLocationRelativeTo(null);//окно по центру экрана
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//закрытие программы при нажатии на крестик
        setResizable(false);//запрет пользователю изменять размер окна

        //добавляем названия столбцов
        dataTitle.add("Фамилия");
        dataTitle.add("Имя");
        dataTitle.add("Отчество");
        dataTitle.add("Дата рождения");
        dataTitle.add("Пол");
        dataTitle.add("Телефон");
        dataTitle.add("Должность");
        dataTitle.add("Отдел");
        dataTitle.add("Зарплата");
        dataTitle.add("Начало работы");
        dataTitle.add("Начальник");

        //создаем таблицу, добавлеяем сортировщик таблицы, устанавливаем режим выбора в таблице одиночный
        tableModel = new DefaultTableModel(data, dataTitle);
        jtable = new JTable(tableModel);
        jtable.setRowSorter(new TableRowSorter<TableModel>(tableModel));
        jtable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


        //добавляем слушателя события мыши в таблицу (щелчок)
        jtable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {//выполнен щелчок
                int selectRow = jtable.getSelectedRow();//получаем значение индекса выбранной строки
                Object selectValues1 = jtable.getValueAt(selectRow, 0);//получаем содержимое выбранной ячейки
                Object selectValues2 = jtable.getValueAt(selectRow, 1);
                Object selectValues3 = jtable.getValueAt(selectRow, 2);
                Object selectValues4 = jtable.getValueAt(selectRow, 3);
                Object selectValues5 = jtable.getValueAt(selectRow, 4);
                Object selectValues6 = jtable.getValueAt(selectRow, 5);
                Object selectValues7 = jtable.getValueAt(selectRow, 6);
                Object selectValues8 = jtable.getValueAt(selectRow, 7);
                Object selectValues9 = jtable.getValueAt(selectRow, 8);
                Object selectValues10 = jtable.getValueAt(selectRow, 9);
                Object selectValues11 = jtable.getValueAt(selectRow, 10);
                textfield1.setText(selectValues1.toString());//Показать содержимое строки в текстовых полях
                textfield2.setText(selectValues2.toString());
                textfield3.setText(selectValues3.toString());
                textfield4.setText(selectValues4.toString());
                textfield5.setText(selectValues5.toString());
                textfield6.setText(selectValues6.toString());
                textfield7.setText(selectValues7.toString());
                textfield8.setText(selectValues8.toString());
                textfield9.setText(selectValues9.toString());
                textfield10.setText(selectValues10.toString());
                textfield11.setText(selectValues11.toString());
            }
        });
        jscrollpane.setViewportView(jtable);
        add(jscrollpane, BorderLayout.NORTH);

        add(jpanelTextField, BoxLayout.X_AXIS);
        add(jpanelButton, BorderLayout.AFTER_LAST_LINE);

        setVisible(true);//делает окно видимым-невидимым
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EmployeesList list = new EmployeesList();
    }
}
