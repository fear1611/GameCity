package Forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormWelcom {

    public FormWelcom(){

        JFrame jFrame = new JFrame() {};
        Image icon = Toolkit.getDefaultToolkit().getImage("city.png");
        jFrame.setIconImage(icon);
        jFrame.setTitle("Вітаємо");

        JLabel label = new JLabel("Вітаємо вас у грі дитинства і всіх розумників!");
        label.setBounds(30,20,400,20);


        JButton jButtonOK=new JButton("Start");
        jButtonOK.setBounds(300,20,70, 20);
        jButtonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FormGame();
                jFrame.dispose();
            }
        });

        jFrame.add(label);
        jFrame.add(jButtonOK);
        //jFrame.add();

        jFrame.setSize(400, 100);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);

        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }

}