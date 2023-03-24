// Updated moveBox program to use a timer instead of a loop, and...
// use a menu to control the speed
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JComponent;
import javax.swing.JFrame;
public class moveBox extends JComponent
{
	public static void main(String[] args)
	{
		Rect box = new Rect();

		MenuFrame frame = new MenuFrame(box);
		frame.add(box);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
private static final int FRAME_WIDTH = 500;
private static final int FRAME_HEIGHT = 300;
} 