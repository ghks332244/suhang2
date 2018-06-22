import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class MenuLookDemo extends JFrame {
	public MenuLookDemo() {
		setTitle("Menu Example");
		setSize(150, 150);
		
		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		menubar.add(fileMenu);
		menubar.add(editMenu);
		
		JMenuItem newAction = new JMenuItem("New");
		JMenuItem openAction = new JMenuItem("Open");
		JMenuItem exitAction = new JMenuItem("Exit");
		JMenuItem cutAction = new JMenuItem("Cut");
		JMenuItem copyAction = new JMenuItem("Copy");
		JMenuItem pasteAction = new JMenuItem("Paste");
		
		JCheckBoxMenuItem checkAction = new JCheckBoxMenuItem("Check Action");
		
		JRadioButtonMenuItem radioAction1 = new JRadioButtonMenuItem("Radio Button1");
		JRadioButtonMenuItem radioAction2 = new JRadioButtonMenuItem("Radio Button2");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(radioAction1);
		bg.add(radioAction2);
		fileMenu.add(newAction);
		fileMenu.add(openAction);
		fileMenu.add(checkAction);
		fileMenu.addSeparator();
		fileMenu.add(exitAction);
		editMenu.add(cutAction);
		editMenu.add(copyAction);
		editMenu.add(pasteAction);
		editMenu.addSeparator();
		editMenu.add(radioAction1);
		editMenu.add(radioAction2);
		
		newAction.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You have click on the new action");
				
			}
		});
	}

	public static void main(String[] args) {
		MenuLookDemo me = new MenuLookDemo();
		me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		me.setVisible(true);

	}

}
