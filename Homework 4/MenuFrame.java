import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuFrame extends JFrame
{
	public MenuFrame(String title, secondHandApp app)
	{
		super (title);
		appRef = app;
		menu();
	}
	public void menu() 
	{
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(createFileMenu());
		menuBar.add(createShowMenu());
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	public JMenu createFileMenu()
	{
		JMenu menu = new JMenu("File");
		menu.add(createFileExitItem());
		return menu;
	}
	
	public JMenuItem createFileExitItem()
	{
		JMenuItem item = new JMenuItem("Exit");
		
		class MenuItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
			}
		}
		
		ActionListener listener = new MenuItemListener();
		item.addActionListener(listener);
		return item;
	}
	
	public JMenu createShowMenu()
	{
		JMenu menu = new JMenu("Show");
		menu.add(createFileSecondHandOn());
		menu.add(createFileSecondHandOff());
		return menu;
	}
	
	public JMenuItem createFileSecondHandOff()
	{
		JMenuItem item = new JMenuItem("Second Hand Off");
		
		class MenuItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				System.out.println("second hand off");
				appRef.secondHandVisible = false;
			}
		}
		
		ActionListener listener = new MenuItemListener();
		item.addActionListener(listener);
		return item;
	}
	
	public JMenuItem createFileSecondHandOn()
	{
		JMenuItem item = new JMenuItem("Second Hand On");
		
		class MenuItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				System.out.println("second hand on");
				appRef.secondHandVisible = true;
			}
		}
		
		ActionListener listener = new MenuItemListener();
		item.addActionListener(listener);
		return item;
	}

private secondHandApp appRef;
private static final int FRAME_WIDTH = 500;
private static final int FRAME_HEIGHT = 300;
}
	