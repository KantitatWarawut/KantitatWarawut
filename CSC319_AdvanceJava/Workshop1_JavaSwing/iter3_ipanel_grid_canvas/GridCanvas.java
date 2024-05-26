package Workshop1_JavaSwing.iter3_ipanel_grid_canvas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import Workshop1_JavaSwing.topCon.applicationWindow;

public class GridCanvas extends JPanel {
    private int id;

    public GridCanvas(int id, int w, int h){
        setPreferredSize(new Dimension(w, h));
        this.id = id;
    }

    public GridCanvas(int id){
        this(id, 300, 300);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.setFont(new Font("Courier", Font.BOLD, 20));

        switch (id) {
            case 1:
                g.drawString("Q1", 25, 25);
                g.setColor(Color.BLACK);
                g.drawArc(100, 100, 400, 400, 90, 90);
                g.setColor(applicationWindow.colorStrategy.getColor(0));
                g.fillArc(100, 100, 400, 400, 90, 90);
                g.setColor(Color.BLACK);
                g.drawLine(300, 0, 300, 300);
                g.drawLine(0, 300, 300, 300);
                break;
            
            case 2:
                g.drawString("Q2", 225, 25);
                g.translate(-300, 0);
                g.setColor(Color.BLACK);
                g.drawArc(100, 100, 400, 400, 0, 90);
                g.setColor(applicationWindow.colorStrategy.getColor(1));
                g.fillArc(100, 100, 400, 400, 0, 90);
                g.setColor(Color.BLACK);
                g.drawLine(300, 0, 300, 300);
                g.drawLine(0, 300, 300, 300);
                break;
            
            case 3:
                g.drawString("Q3", 25, 225);
                g.translate(0, -300);
                g.setColor(Color.BLACK);
                g.drawArc(100, 100, 400, 400, 180, 90);
                g.setColor(applicationWindow.colorStrategy.getColor(2));
                g.fillArc(100, 100, 400, 400, 180, 90);
                g.setColor(Color.BLACK);
                g.drawLine(300, 0, 300, 300);
                g.drawLine(0, 300, 300, 300);
                break;

            case 4:
                g.drawString("Q4", 225, 225);
                g.translate(-300, -300);
                g.setColor(Color.BLACK);
                g.drawArc(100, 100, 400, 400, 270, 90);
                g.setColor(applicationWindow.colorStrategy.getColor(3));
                g.fillArc(100, 100, 400, 400, 270, 90);
                g.setColor(Color.BLACK);
                g.drawLine(300, 0, 300, 300);
                g.drawLine(0, 300, 300, 300);
                break;
        }
    }
}