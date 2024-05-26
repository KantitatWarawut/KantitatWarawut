package Workshop1_JavaSwing.iter4_ipanel_fillarc_strategy;

import java.awt.Color;

public class ColorStrategy {
    protected Color[] colors;

    public ColorStrategy(){
        colors = new Color[4];
    }

    public Color getColor(int id){
        return colors[id];
    }
}
