package Widgets;

import java.awt.Dimension;

import javax.swing.JButton;

public class Numbutton extends JButton{

    public Numbutton(int number){
        this.setBounds(500, 500, 50, 50);
        this.setText(Integer.toString(number));
        this.setPreferredSize(new Dimension(50, 50));
        
        
    }

    

}
