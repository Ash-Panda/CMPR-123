import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class circleTangeline extends JComponent
{
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.black);
		
		Ellipse2D.Double circle = new Ellipse2D.Double(10.0,10.0,100.0,100.0);
		g2.draw(circle);
		Line2D.Double secondHand = new Line2D.Double(100.0,100.0,110.0);
	}
}