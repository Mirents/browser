package test;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;

public class browser {
	private static JButton buttonClose;

	public static void main(String[] args) {
		//JFrame.setDefaultLookAndFeelDecorated(true);
	    JFrame frame = new JFrame("JPanel Example");
	    frame.setBackground(new Color(119, 136, 153));
	    Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
	    frame.setSize(sSize.width,sSize.height);
	    frame.setExtendedState(frame.MAXIMIZED_BOTH);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setUndecorated(true);
	    
	    buttonClose = new JButton("Close");
	    buttonClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
	    });
	    frame.add(buttonClose);
	    
	    frame.setVisible(true);
	}

}
