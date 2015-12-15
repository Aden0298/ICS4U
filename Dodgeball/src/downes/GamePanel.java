package downes;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This is the beginning of a simple game. You should expand it into a dodgeball
 * game, where the user controls an object with the mouse or keyboard, and tries
 * to avoid the balls flying around the screen. If they get hit, it's game over.
 * If they survive for 20 seconds (or some other fixed time), they go on to the
 * next level. <br>
 * <br>
 * Should be run at around 500x300 pixels.<br>
 * <br>
 * @version Nov. 2015
 * 
 * @author Christina Kemp adapted from Sam Scott
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable, MouseMotionListener {

	int x = -1;
	int y = -1;
	int width = 1100;
	int height = 900;
	boolean hit = false;
	
		 
	

	/**
	 * The number of balls on the screen.
	 */
	final int numBalls = 1;
	/**
	 * The pause between repainting (should be set for about 30 frames per
	 * second).
	 */
	final int pauseDuration = 50;
	/**
	 * An array of balls.
	 */
	FlashingBall[] ball = new FlashingBall[numBalls];

	/** main program (entry point) */
	public static void main(String[] args) {

		// Set up main window (using Swing's Jframe)
		JFrame frame = new JFrame("Sub hunt");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(1100, 900));
		frame.setAutoRequestFocus(false);
		frame.setVisible(true);
		Container c = frame.getContentPane();
		c.add(new GamePanel());
		frame.pack();


	}

	
	public GamePanel(){
		// Start the ball bouncing (in its own thread)
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.BLACK);
		
		for (int i = 0; i < numBalls; i++) {
			ball[i] = new FlashingBall(50, 50, 0, width, 0, height);
			ball[i].setXSpeed((Math.random() * 16), 1);
			ball[i].setYSpeed((Math.random() * 16), 1);
			ball[i].setColor(Color.black/*new Color (/*((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256))/)*/);
			
		}
		addMouseMotionListener (this);
		Thread gameThread = new Thread(this);
		gameThread.start();

	}

	/**
	 * Repaints the frame periodically.
	 */
	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(pauseDuration);
			} catch (InterruptedException e) {
			}
		}
	}

	/**
	 * Clears the screen and paints the balls.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < numBalls; i++) {
			ball[i].draw(g);
		}
		g.setColor(Color.green);
		g.fillOval(x, y, 30, 30);
		
		
		if (hit){
			g.setColor(Color.white);
			g.drawString("You win!", 30, 5);
		}
		
	}
	
	
	
	 public void mouseMoved (MouseEvent e){
 
		 x = e.getX ();
		 y = e.getY (); 
		 for(int i = 0; i< numBalls; i++){
			 double bx = ball[i].getX();
			 double by = ball[i].getY();
			 double bsx = ball[i].getXSpeed(); //Ball's x speed		 
			 double bsy = ball[i].getYSpeed();	//Ball's y speed	 
			 //double mx = e.getX();
			 //double my = e.getY();
			 /*if ((x+5) <= bx && bx <= (x-5) || (y+5) <= by && by<= (y-5)) {
				 ball[i].setXSpeed(bsx, -1); //negative x speed
				 ball[i].setYSpeed(bsy, -1); //negative y speed
			 }*/
			 if (x == bx && y == by){
				hit = true;
				ball[i].setXSpeed(bsx, 0);
				ball[i].setYSpeed(bsy, 0);
			 }
			 }
		 repaint ();
		 
	 }
	 
	 
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		//Scatters balls if the mouse is clicked
		
		
	
		 //x = e.getX ();
		 //y = e.getY (); 
		 repaint ();
			 
		
	}
	
	



}
