package Workshop1_JavaSwing.iter4_ipanel_fillarc_strategy;

import java.awt.Color;
import java.util.Random;

public class RandomColorStrategy extends ColorStrategy{
    private final Color[] colorChoices = 
    {
        Color.RED, 
        Color.PINK, 
        Color.YELLOW, 
        Color.BLUE,
        Color.GREEN,
        Color.CYAN,
        Color.MAGENTA,
        Color.ORANGE,
        Color.DARK_GRAY,
        Color.LIGHT_GRAY,
        Color.GRAY,
        Color.BLACK,
        Color.WHITE,
    };

    private Random rand;

    public RandomColorStrategy(){
        rand = new Random();
        colors[0] = colorChoices[rand.nextInt(colorChoices.length)];
        colors[1] = colorChoices[rand.nextInt(colorChoices.length)];
        colors[2] = colorChoices[rand.nextInt(colorChoices.length)];
        colors[3] = colorChoices[rand.nextInt(colorChoices.length)];
    }
}
