package brick.model;

import javax.swing.JFrame;

public class BrickJFrame 
{
	public static void main(String[] args)
	{
		JFrame obj = new JFrame();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Breaker Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(brickJPanel);
	}
}	
