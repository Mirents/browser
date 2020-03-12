package test;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

public class browser {
	private static JButton buttonClose;
	private static JButton buttonOpenBrowser;

	public static void main(String[] args) {
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
	    
	    buttonOpenBrowser = new JButton("Open browser");
	    
	    Container cont = frame.getContentPane();
	    cont.add(buttonClose, BorderLayout.NORTH);
	    cont.add(buttonOpenBrowser, BorderLayout.WEST);
	    
	    frame.setVisible(true);
	}

}
