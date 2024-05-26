package Workshop1_JavaSwing.topCon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Workshop1_JavaSwing.iter2_ipanel.MainCanvas;
import Workshop1_JavaSwing.iter4_ipanel_fillarc_strategy.ColorStrategy;
import Workshop1_JavaSwing.iter4_ipanel_fillarc_strategy.DefaultColorStrategy;
import Workshop1_JavaSwing.iter4_ipanel_fillarc_strategy.RandomColorStrategy;

public class applicationWindow implements ActionListener {

    JFrame topCon = new JFrame("Composite on Action");

    public static ColorStrategy colorStrategy = new DefaultColorStrategy();

    public applicationWindow(int w, int h){
        topCon.setSize(w, h);
        topCon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        topCon.setJMenuBar(menuBar);
        JMenu colorMenu = new JMenu("Color Options");
        menuBar.add(colorMenu);
        JMenuItem defaultColor = new JMenuItem("Default");
        JMenuItem randomColor = new JMenuItem("Random");
        defaultColor.addActionListener(this);
        randomColor.addActionListener(this);
        colorMenu.add(defaultColor);
        colorMenu.add(randomColor);

        topCon.add(new MainCanvas());
        topCon.pack();
        topCon.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();

        topCon.setVisible(false);

        if (command.equals("Random")) {
            colorStrategy = new RandomColorStrategy();
        }else{
            colorStrategy = new DefaultColorStrategy();
        }

        topCon.setVisible(true);
    }

    public applicationWindow(){
        this(600, 600);
    }

    
}

