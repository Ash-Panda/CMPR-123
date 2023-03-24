import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class MenuFrame extends JFrame // // Create the menu for MenuFrame
{
	public MenuFrame(Rect s)
	{
		circleRef = s;
		// Construct menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(createFileMenu());
		menuBar.add(createSpeedMenu());
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}

	// Creates the File menu.
	public JMenu createFileMenu()
	{
		JMenu menu = new JMenu("test");
		menu.add(createFileExitItem());
		return menu;
	}

	public JMenuItem createFileExitItem() // Creates the File->Exit menu item and sets its action listener.
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
	public JMenu createSpeedMenu() // Creates the Speed menu.
	{
		JMenu menu = new JMenu("Speed");
		menu.add(createSpeed10Item()); // NOTE: Added a 10 ms. Update rate for higher speed
		menu.add(createSpeed250Item());
		menu.add(createSpeed500Item());
		menu.add(createSpeed1000Item());
		return menu;
	}
	
	public JMenuItem createSpeed10Item()
	{
		JMenuItem item = new JMenuItem("10");
		
		class MenuItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				circleRef.setSleepPeriod(10);
			}
		}
		
		ActionListener listener = new MenuItemListener();
		item.addActionListener(listener);
		return item;
	}
	
	public JMenuItem createSpeed250Item()
	{
		JMenuItem item = new JMenuItem("250");
		class MenuItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				circleRef.setSleepPeriod(250);
			}
		}
		
		ActionListener listener = new MenuItemListener();
		item.addActionListener(listener);
		return item;
	}
	
	public JMenuItem createSpeed500Item()
	{
		JMenuItem item = new JMenuItem("500");
		class MenuItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				circleRef.setSleepPeriod(500);
			}
		}
		
		ActionListener listener = new MenuItemListener();
		item.addActionListener(listener);
		return item;
	}
	
	public JMenuItem createSpeed1000Item()
	{
		JMenuItem item = new JMenuItem("1000");
		class MenuItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				circleRef.setSleepPeriod(1000);
			}
		}
		
		ActionListener listener = new MenuItemListener();
		item.addActionListener(listener);
		return item;
	}
	
private Rect circleRef;
private static final int FRAME_WIDTH = 300;
private static final int FRAME_HEIGHT = 200;
}