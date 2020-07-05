import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcView extends Panel {
    JTextField inn;
    JLabel outt;
    JButton button;
    String str;
    String rezultat;

    public CalcView() {
        JFrame frame = new JFrame("Калькулятор");
        frame.setSize(280, 200);

        JLabel label = new JLabel("Введите здесь выражение:");
        label.setBounds(60, 15, 170, 30);
        frame.add(label);

        inn = new JTextField();
        inn.setBounds(60, 40, 160, 30);
        frame.add(inn);

        button = new JButton("Получи результат");
        button.setBounds(60, 80, 160, 30);
        frame.add(button);

        JLabel label2 = new JLabel("Ответ:");
        label2.setBounds(60, 120, 40, 30);
        frame.add(label2);

        outt = new JLabel("0");
        outt.setBounds(100, 120, 100, 30);
        frame.add(outt);

        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


        FieldHandler handler = new FieldHandler();
        inn.addActionListener(handler);
        button.addActionListener(handler);


    }

    class FieldHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == button) {

                str = inn.getText();
                CalcArifmetik calcArifmetik = new CalcArifmetik();
                rezultat =  calcArifmetik.calcArifmetik(str);

                 outt.setText(rezultat);
            }
        }
    }

}
