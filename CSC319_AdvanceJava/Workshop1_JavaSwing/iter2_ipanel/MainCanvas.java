package  Workshop1_JavaSwing.iter2_ipanel;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JPanel;

import Workshop1_JavaSwing.iter3_ipanel_grid_canvas.GridCanvas;

public class MainCanvas extends JPanel{

    public MainCanvas(int w, int h){
        setPreferredSize(new Dimension(w, h));
        setLayout(new GridLayout(2, 2));
        add(new GridCanvas(1));
        add(new GridCanvas(2));
        add(new GridCanvas(3));
        add(new GridCanvas(4));
    }

    public MainCanvas(){
        this(600, 600);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawLine(300, 0, 300, 600);
        g.drawLine(0, 300, 600, 300);
        g.drawOval(100, 100, 400, 400);
    }
}
