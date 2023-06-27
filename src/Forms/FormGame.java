package Forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormGame {

    public FormGame(){
        JFrame jFrame = new JFrame() {};
        Image icon = Toolkit.getDefaultToolkit().getImage("city.png");
        jFrame.setIconImage(icon);
        jFrame.setTitle("Mіста");

        JTextField fieldPayer = new JTextField();
        fieldPayer.setBounds(30,30,120,20);
        JLabel lablePlayer = new JLabel("Введіть назву міста");
        lablePlayer.setBounds(160,30, 120, 20);

        JButton jButtonСourse = new JButton("Зробити хід");
        jButtonСourse.setBounds(30, 60, 120, 20);
        jButtonСourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fieldPayer.getText().equalsIgnoreCase("Здаюсь")) {
                    JOptionPane.showMessageDialog(jFrame,"Ви здалися");
                };
            }
        });

        JLabel lableComp = new JLabel("Ком'пютер: ");
        lableComp.setBounds(160,60, 120, 20);


        jFrame.add(jButtonСourse);
        jFrame.add(lableComp);
        jFrame.add(lablePlayer);
        jFrame.add(fieldPayer);

        jFrame.setSize(400, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);

        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

}
