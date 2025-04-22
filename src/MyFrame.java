import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Label;

public class MyFrame extends JFrame {

    MyFrame(){

        JLabel label = new JLabel();
        label.setText("Hello, welcome to a new calculating experience");
        label.setVerticalAlignment(JLabel.CENTER);;  
        label.setHorizontalAlignment(JLabel.CENTER);
        
        
        
        this.add(label);
        this.setSize(420,420);
        this.setTitle("A better calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
       
        
        
        
        this.setVisible(true);


        

    }

}
