package test;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class testJ {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
	    JFrame frame = new JFrame("JPanel Example");
	    Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
	    frame.setSize(sSize.width,sSize.height);
	    frame.setExtendedState(frame.MAXIMIZED_BOTH);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}

}
