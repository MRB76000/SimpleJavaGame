import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Widgets.Numbutton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class MyFrame extends JFrame implements ActionListener {

    public JLabel label;
    public Timer timer;
    public Numbutton one;

    MyFrame() {

        MyFrame self = this;

        one = new Numbutton(1);
        one.addActionListener(this);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(one);


        this.setSize(2000, 2000);
        this.add(panel);
        this.setTitle("A better calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        timer = new Timer();
        timer.schedule(bruh(this), 2000);

    }

    public static void delete(MyFrame k) {
        k.remove(k.label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == one) {
            System.out.println("perfect");
        }
    }

    public static TimerTask bruh(MyFrame k) {

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                delete(k);
                System.out.println("completed");
                k.repaint();
            }

        };
        return task;

    }

}
