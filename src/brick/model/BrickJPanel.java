package brick.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JPanel;

public class BrickJPanel extends JPanel implements KeyListener, ActionListener
{
	// Game start(won't let game play by itself)
	private boolean play = false;
	private int score = 0;
	
	private int totalBricks = 21;
	
	//Ball speed
	private Timer timer;
	private int delay = 8;
	
	
	private int playerX = 310;
	
	private int ballposX = 120;
	private int ballposY = 350;
	private int ballXdir = -1;
	private int ballYdir = -2;
	
	public BrickJPanel()
	{
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay, this);
		timer.start();
	}
	
	public void paint(Graphics g)
	{
		// background
		g.setColor(Color.black);
		g.fillRect(1, 1, 692, 592);
		
		//Game Borders
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 592);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(691, 0, 3, 592);
		
		//Paddle
		g.setColor(Color.green);
		g.fillRect(playerX, 550, 100, 8);
		
		
		//Ball
		g.setColor(Color.yellow);
		g.fillRect(ballposX, ballposY, 20, 20);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			if(playerX >=600)
			{
				playerX = 600;
			}
				else
				{
					moveRight();
				}
			
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			if(playerX < 10)
			{
				playerX = 10;
			}
				else
				{
					moveLeft();
				}
		}
	}
	
	public void moveRight()
	{
		play = true;
		playerX+=20;
	}
	public void moveLeft()
	{
		play = true;
		playerX-=20;
	}
	@Override
	public void keyReleased(KeyEvent e) {}

}
