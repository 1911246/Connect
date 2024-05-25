import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConnectFourView extends JFrame{
	
	//Customize View
	 
	private int screenWidth = 800;
	private int screenHeight = 600;
	
	public ConnectFourView() {
		
		super.setTitle("Connect4");
		super.setSize(screenWidth,screenHeight);
		
		//Layout manager will help place widgets on screen
		super.setLayout(new BorderLayout());
		
		//add widgets
		JPanel topPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		
		JLabel instructions = new JLabel("Connect4");
		

		JLabel Coded = new JLabel("Coded By Neha and Megan");
		
		topPanel.add(instructions);
		super.add(topPanel, BorderLayout.NORTH);
		
		
		
		super.add(topPanel,BorderLayout.PAGE_START);
		
		bottomPanel.add(Coded);
		super.add(bottomPanel, BorderLayout.SOUTH);
		
		//Widget that can do stuff
		JPanel center = new JPanel();
		//example
		
		
		JButton arr[][] = new JButton[6][7];
		for(int r =0; r<6;r++) {
			for(int c=0; c<7; c++) {
				JButton b1 = new JButton(" ");
				b1.addActionListener(new ButtonListener(b1));
				center.add(b1);
			}
			
		}
		
		super.add(center,BorderLayout.CENTER);
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Set visibility
		super.setVisible(true);
		
		
	}
	
}
