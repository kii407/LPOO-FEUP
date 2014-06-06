package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Utilities {
	public static Dimension dimScreen = Toolkit.getDefaultToolkit().getScreenSize();
	public static Dimension optionsMenuSize = new Dimension(600, 600);
	public static Color[] ballsColors = { Color.WHITE, Color.RED.darker(), Color.YELLOW.darker(),
			Color.GREEN, new Color(150, 75, 0), Color.BLUE.darker(),
			Color.PINK.darker(), Color.BLACK };

}
