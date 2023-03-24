// secondHandApp.java
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class secondHandApp extends JComponent
{
	public secondHandApp()
	{
		secondHandVisible = true;
		start();
	}
	
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.black);

		// Draw the face of the clock...a circle for this program
		Ellipse2D.Double circle = new Ellipse2D.Double(TOP, LEFT, WIDTH, HEIGHT);
		g2.draw(circle);
		Point2D.Double center = new Point2D.Double( (HEIGHT+LEFT+LEFT)/2, (WIDTH+TOP+TOP)/2);

		// Get time of day...
		GregorianCalendar currentTime = new GregorianCalendar();
		
		int seconds = currentTime.get(Calendar.SECOND);
		int minutes = currentTime.get(Calendar.MINUTE);
		int hours = currentTime.get(Calendar.HOUR);
		
		double percent_of_60secs = seconds / 60.0;
		double percent_of_60minutes = minutes / 60.0;
		double percent_of_24hours = hours / 12.0;
		
		double x_second = Math.cos(TWO_PI * percent_of_60secs - HALF_PI) * SECOND_HAND_RADIUS + HOFFSET;
		double y_second = Math.sin(TWO_PI * percent_of_60secs - HALF_PI) * SECOND_HAND_RADIUS + VOFFSET;
		double x_minute = Math.cos(TWO_PI * percent_of_60minutes - HALF_PI) * MINUTE_HAND_RADIUS + HOFFSET;
		double y_minute = Math.sin(TWO_PI * percent_of_60minutes - HALF_PI) * MINUTE_HAND_RADIUS + VOFFSET;		
		double x_hour = Math.cos(TWO_PI * percent_of_24hours - HALF_PI) * HOUR_HAND_RADIUS + VOFFSET;
		double y_hour = Math.sin(TWO_PI * percent_of_24hours - HALF_PI) * HOUR_HAND_RADIUS + VOFFSET;
		
		Point2D.Double p1 = new Point2D.Double(x_second,y_second);
		Point2D.Double p2 = new Point2D.Double(x_minute,y_minute);
		Point2D.Double p3 = new Point2D.Double(x_hour,y_hour);
		
		Line2D.Double secondHand = new Line2D.Double(p1, center);
		Line2D.Double firstHand = new Line2D.Double(p2, center);
		Line2D.Double thirdHand = new Line2D.Double(p3, center);
		
		g2.setColor(Color.black);
		g2.draw(thirdHand);
		if (secondHandVisible)
		{
			g2.draw(secondHand);
		}
			g2.draw(firstHand);
	}
	// Create a timer to generate an event (call to repaint()) once per second
	public void start()
	{
		
		class EventTimer implements ActionListener // Note: a class within a method
		{
		
			public void actionPerformed(ActionEvent event)
			{
			repaint();
			}
		}
		
		EventTimer listener = new EventTimer();
		Timer t = new Timer(1000, listener); // 1000 is the # of milliseconds to wait
		t.start();
	}
	
	
public static final int TOP = 10;
public static final int LEFT = 10;
public static final int WIDTH = 100;
public static final int HEIGHT = 100;
public static final int HOFFSET = (HEIGHT+LEFT+LEFT)/2;
public static final int VOFFSET = (WIDTH+TOP+TOP)/2;
public static final double TOTAL_PERCENT = 100;
public static final double RADIUS = 20;
public static final double TWO_PI = 2.0 * Math.PI;
public static final int MINUTE_HAND_RADIUS = 35;
public static final int HOUR_HAND_RADIUS = 22;
public static final int SECOND_HAND_RADIUS = 40;
public static final double HALF_PI = Math.PI/2;
public static final double MINS_PER_HOUR = 60;
private static final int FRAME_WIDTH = 300;
private static final int FRAME_HEIGHT = 200;
public boolean secondHandVisible;
}