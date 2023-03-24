import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;
// This component animates a rectangle based on the user selected speed

public class Rect extends JComponent
{
		public Rect()
		{
			// The rectangle that the paint method draws
			sleepPeriod = 10; // start the update rate at 10 ms
			box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
			start();
		}

		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			g2.draw(box);
		}

		public void moveTo(int x, int y)
		{
			box.setLocation(x, y);
			repaint();
		}

		public void setSleepPeriod(int value)
		{
			sleepPeriod = value;
			t.setDelay(sleepPeriod);
		}

		public int getSleepPeriod()
		{
			return sleepPeriod;
		}
		
		public void start() // Is this implementation completely in keeping with MVC?
		{
			class EventTimer implements ActionListener
		{
		
		public EventTimer()
		{
			x = 0;
		}
		
		public void actionPerformed(ActionEvent event)
		{
			moveTo(++x, 40);
			t.setDelay(sleepPeriod);
		}

		private int x;
		}
			// Asynchronous updates to the animated box using a timer
			EventTimer listener = new EventTimer();
			t = new Timer(sleepPeriod, listener);
			t.start();
		}
		
private int sleepPeriod; // used in two different contexts/scopes, so defined here
private static Timer t;
private Rectangle box;
private static final int BOX_X = 100;
private static final int BOX_Y = 100;
private static final int BOX_WIDTH = 20;
private static final int BOX_HEIGHT = 30;
} 