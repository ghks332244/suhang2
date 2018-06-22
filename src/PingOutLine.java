import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.BevelBorder;
import javax.swing.table.TableCellRenderer;

public class PingOutLine extends JFrame {
	
	String ip;
	String[] titles;
	Object[][] stats;
	public PingOutLine() {
		super("network scanner");
		//
		String myIp=null;
		String myHostName=null;
		
		
		InetAddress ia=null;
		try {
			ia=InetAddress.getLocalHost();
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		myIp= ia.getHostAddress();
		myHostName = ia.getHostName();
		
		String fixed = myIp.substring(0,myIp.lastIndexOf(".")+1 );
		String fixedlast = fixed+"254";
		
		System.out.println(myIp);
		System.out.println(fixedlast);
		System.out.println(myHostName+" "+fixed);
		
		/*String hostNameCmd = "hostName";
		Runtime hostNameRunTime = Runtime.getRuntime();
		Process hostnameprocess = hostNameRunTime.exec(hostNameCmd);
		InputStreamReader isr = new InputStreamReader(hostnameprocess.getInputStream());
		Stry mythodom = isr.read();*/
		
		//
		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);
		JMenu scanMenu = new JMenu("Scan");
		JMenu goMenu = new JMenu("Go to");
		JMenu commandMenu = new JMenu("Command");
		JMenu favoritesMenu = new JMenu("Favorites");
		JMenu toolsMenu = new JMenu("Tools");
		JMenu helpMenu = new JMenu("Help");
		menubar.add(scanMenu);
		menubar.add(goMenu);
		menubar.add(commandMenu);
		menubar.add(favoritesMenu);
		menubar.add(toolsMenu);
		menubar.add(helpMenu);
		
		JMenuItem loadFromFileAction = new JMenuItem("Load from File");
		JMenuItem exportAllAction = new JMenuItem("Export all");
		JMenuItem exportCelectionAction = new JMenuItem("Export celection");
		JMenuItem quitAction = new JMenuItem("Quit");
		
		JMenuItem nextAliveHostAction = new JMenuItem("Next alive host");
		JMenuItem nextOpenPortAction = new JMenuItem("Next open port");
		JMenuItem nextDeadPortAction = new JMenuItem("Next dead port");
		JMenuItem previousAliveHostAction = new JMenuItem("previousAliveHost");
		JMenuItem preViousOpenPortAction = new JMenuItem("PreVious open port");
		JMenuItem preViousDeadPortAction = new JMenuItem("PreVious dead port");
		JMenuItem FindAction = new JMenuItem("Find");
		
		JMenuItem showDetailAction = new JMenuItem("Show detail");
		JMenuItem rescanIPAction = new JMenuItem("Rescan IP");
		JMenuItem deleteIPAction = new JMenuItem("Delete IP");
		JMenuItem copyIPAction = new JMenuItem("Copy IP");
		JMenuItem copyDetailsAction = new JMenuItem("copy details");
		JMenuItem openAction = new JMenuItem("Open");
		
		JMenuItem addCurrentAction = new JMenuItem("Add current");
		JMenuItem margeFavoritesAction = new JMenuItem("Marge favorites");
		JMenuItem preferenceAction = new JMenuItem("Preference...");
		JMenuItem fetchersAction = new JMenuItem("Fetchers");
		JMenuItem selectionAction = new JMenuItem("Selection");
		JMenuItem scanStatiesAction = new JMenuItem("Scan staties");
		
		JMenuItem gettingStartedAction = new JMenuItem("Getting started");
		JMenuItem officialWebsiteAction = new JMenuItem("Official website");
		JMenuItem FAQAction = new JMenuItem("FAQ");
		JMenuItem reportAnIssueAction = new JMenuItem("reportAnIssue");
		JMenuItem command_lineUsagepruginsAction = new JMenuItem("Command-line usage");
		JMenuItem pruginsAction = new JMenuItem("Prugins");
		JMenuItem checkForNewerVersionAction = new JMenuItem("Check for newer version");
		JMenuItem AboutAction = new JMenuItem("About");
		
		scanMenu.add(loadFromFileAction);
		scanMenu.add(exportAllAction);
		scanMenu.add(exportCelectionAction);
		scanMenu.addSeparator();
		scanMenu.add(quitAction);
		
		loadFromFileAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		exportAllAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		exportCelectionAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		
		goMenu.add(nextAliveHostAction);
		goMenu.add(nextOpenPortAction);
		goMenu.add(nextDeadPortAction);
		goMenu.addSeparator();
		goMenu.add(previousAliveHostAction);
		goMenu.add(preViousOpenPortAction);
		goMenu.add(preViousDeadPortAction);
		goMenu.addSeparator();
		goMenu.add(FindAction);
		
		nextAliveHostAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		nextDeadPortAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		nextOpenPortAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		previousAliveHostAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		preViousDeadPortAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		preViousOpenPortAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		FindAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		
		commandMenu.add(showDetailAction);
		commandMenu.addSeparator();
		commandMenu.add(rescanIPAction);
		commandMenu.add(deleteIPAction);
		commandMenu.addSeparator();
		commandMenu.add(copyIPAction);
		commandMenu.add(copyDetailsAction);
		commandMenu.addSeparator();
		commandMenu.add(openAction);
		
		showDetailAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		rescanIPAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		deleteIPAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		copyDetailsAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		copyIPAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		openAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		
		favoritesMenu.add(addCurrentAction);
		favoritesMenu.add(margeFavoritesAction);
		
		addCurrentAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		margeFavoritesAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		
		toolsMenu.add(preferenceAction);
		toolsMenu.add(fetchersAction);
		toolsMenu.addSeparator();
		toolsMenu.add(selectionAction);
		toolsMenu.add(scanStatiesAction);
		
		preferenceAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		fetchersAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		selectionAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		scanStatiesAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		
		helpMenu.add(gettingStartedAction);
		helpMenu.addSeparator();
		helpMenu.add(officialWebsiteAction);
		helpMenu.add(FAQAction);
		helpMenu.add(reportAnIssueAction);
		helpMenu.add(pruginsAction);
		helpMenu.addSeparator();
		helpMenu.add(command_lineUsagepruginsAction);
		helpMenu.addSeparator();
		helpMenu.add(checkForNewerVersionAction);
		helpMenu.addSeparator();
		helpMenu.add(AboutAction);
		
		gettingStartedAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		pruginsAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		command_lineUsagepruginsAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		checkForNewerVersionAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UnImplement frame = new UnImplement();
				frame.setVisible(true);
			}
		});
		AboutAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://github.com/ghks332244"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			}
		});
		FAQAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Email frame = new Email();
				frame.setVisible(true);
				
			}
		}); 
		reportAnIssueAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Email frame = new Email();
				frame.setVisible(true);
				
			}
		});
		officialWebsiteAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://github.com/ghks332244"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				
			}
		});
		//
		Font myfont = new Font("Serif",Font.BOLD,16);
		JToolBar toolbar1 = new JToolBar();
		toolbar1.setLayout(new FlowLayout(FlowLayout.LEFT));
		JToolBar toolbar2 = new JToolBar();	
		toolbar2.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel ipRagrLabel = new JLabel("IP Range:");
		JTextField ipstartTextField = new JTextField(10);
		JLabel toLabel = new JLabel("to");
		JTextField ipEndTextFeild = new JTextField(10);
		JComboBox sourceSelectionCombobox = new JComboBox();
		sourceSelectionCombobox.addItem("IP Range");
		sourceSelectionCombobox.addItem("Random");
		sourceSelectionCombobox.addItem("File");
		
		toLabel.setFont(myfont);
		ipRagrLabel.setFont(myfont);
		ipRagrLabel.setPreferredSize(new Dimension(80, 30));
		toLabel.setPreferredSize(new Dimension(20, 30));
		sourceSelectionCombobox.setPreferredSize(new Dimension(75,22));
		
		toolbar1.add(ipRagrLabel);
		toolbar1.add(ipstartTextField);
		toolbar1.add(toLabel);
		toolbar1.add(ipEndTextFeild);
		toolbar1.add(sourceSelectionCombobox);
		
		JLabel hostName = new JLabel("HostName:");
		JTextField hostNameTextFeild = new JTextField(10);
		JButton ipButton = new JButton("IP");
		JComboBox netMaskComboBox = new JComboBox();
		netMaskComboBox.addItem("/24");
		netMaskComboBox.addItem("/26");
		
		ImageIcon start = new ImageIcon(System.getProperty("user.dir") +"\\src\\start.png");
		JButton startButton = new JButton(start);
		startButton.setText("Start");
		ImageIcon stop = new ImageIcon(System.getProperty("user.dir") +"\\src\\stop.png");
		JButton stopButton = new JButton(stop);
		stopButton.setText("Stop");
		
		hostName.setFont(myfont);
		hostName.setPreferredSize(new Dimension(80, 30));
		ipButton.setPreferredSize(new Dimension(40,22));
		netMaskComboBox.setPreferredSize(new Dimension(93,22));
		startButton.setPreferredSize(new Dimension(78,22));
		stopButton.setPreferredSize(new Dimension(78,22));
		
		toolbar2.add(hostName);
		toolbar2.add(hostNameTextFeild);
		toolbar2.add(ipButton);
		toolbar2.add(netMaskComboBox);
		toolbar2.add(startButton);
		
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(toolbar1,BorderLayout.NORTH);
		panel.add(toolbar2,BorderLayout.SOUTH);
		add(panel,BorderLayout.NORTH);
		//
		titles = new String[]{"IP","Ping","TTL","Hostname","Ports"};
		stats = initializeTanle();
		
		JTable jtable = new JTable(stats,titles);
		
		JScrollPane jcrollpane = new JScrollPane(jtable);
		add(jcrollpane, BorderLayout.CENTER);
		//
		JPanel statusPanel = new JPanel();
		JPanel statusP1= new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		statusP1.setPreferredSize(new Dimension(60, 20));
		statusP1.setBorder(new BevelBorder(BevelBorder.LOWERED));
		JPanel statusP2= new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		statusP2.setPreferredSize(new Dimension(60, 20));
		statusP2.setBorder(new BevelBorder(BevelBorder.LOWERED));
		JPanel statusP3= new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
		statusP3.setPreferredSize(new Dimension(60, 20));
		statusP3.setBorder(new BevelBorder(BevelBorder.LOWERED));
		getContentPane().add(statusPanel,BorderLayout.SOUTH);
		JLabel readystatusLabel = new JLabel("Ready");
		JLabel displaystatusLabel = new JLabel("Displays : All");
		JLabel threadstatusLabel = new JLabel("Thread : 0");
		statusP1.add(readystatusLabel);
		statusP2.add(displaystatusLabel);
		statusP3.add(threadstatusLabel);
		statusPanel.setLayout(new BoxLayout(statusPanel,BoxLayout.X_AXIS));
		statusPanel.add(statusP1);
		statusPanel.add(statusP2);
		statusPanel.add(statusP3);
		JProgressBar statusbar = new JProgressBar();
		statusbar.setPreferredSize(new Dimension(120, 20));
		statusPanel.add(statusbar);
		statusbar.setIndeterminate(false);
		//
		quitAction.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	
			}
		});
		//
		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int IPStartnum = Integer.parseInt(ipstartTextField.getText().substring(ipstartTextField.getText().lastIndexOf(".") + 1));
				int IPEndnum = Integer.parseInt(ipEndTextFeild.getText().substring(ipEndTextFeild.getText().lastIndexOf(".") + 1));
				toolbar2.remove(startButton);
				toolbar2.add(stopButton);
				statusbar.setIndeterminate(true);
				readystatusLabel.setText("searching");
				jtable.repaint();
				statusPanel.repaint();
				jtable.getColumnModel().getColumn(0).setCellRenderer(new TableCellRenderer() {

					@Override
					public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
							boolean hasFocus, int row, int column) {
						// TODO Auto-generated method stub
						if (value instanceof JLabel) return (JLabel) value;
						return null;
					}
					
				});
				new Thread(() -> {
				Pinging[] pg = new Pinging[IPEndnum];
				for(int i=IPStartnum-1; i<IPEndnum ; i++) {
					Object[] msg = stats[i];
					pg[i] = new Pinging(fixed+i,msg);
					pg[i].start();
				}
				while (Thread.activeCount()>3)
				{
					jtable.repaint();
					threadstatusLabel.setText("Threads: " + (Thread.activeCount()-3));
				}
				for(int i=IPStartnum-1;i<IPEndnum;i++) {
					// scan code
					jtable.repaint();
					if(stats[i][1]!="[n/a]"||stats[i][2]!="[n/s]"||stats[i][3]!="[n/s]") {
						PortScanner ps = new PortScanner();
						final ExecutorService es = Executors.newFixedThreadPool(200);
						final int timeout = 200;
						final List<Future<ScanResult>> futures = new ArrayList<>();
						for (int port = 1; port <= 1024; port++) {
							futures.add(ps.portIsOpen(es, fixed + i, port, timeout));
						}
						try {
							es.awaitTermination(200L, TimeUnit.MICROSECONDS);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						int openPorts = 0;
						for (final Future<ScanResult> f : futures) {
							try {
								if (f.get().isOpen()) {
									openPorts++;
									stats[i][4] = (stats[i][4] == null)?f.get().getPort(): (stats[i][4].toString() + "," +f.get().getPort());
								}
							} catch (InterruptedException | ExecutionException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						jtable.repaint();
						es.shutdown();
					} else {
						stats[i][4] = "[n/s]";
						
					}
					if(stats[i][4]==null)
						stats[i][4] = "[n/s]";
				
					jtable.repaint();
					statusPanel.repaint();
						
				}
				jtable.repaint();
				threadstatusLabel.setText("Threads: 0" );
				statusbar.setIndeterminate(false);
				toolbar2.remove(stopButton);
				toolbar2.add(startButton);		
				readystatusLabel.setText("ready");
				jtable.repaint();
				statusPanel.repaint();
				complete cp = new complete();
				cp.setVisible(true);
				}).start();	
			}
		});
		stopButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == stopButton) {
					statusbar.setIndeterminate(false);
					toolbar2.remove(stopButton);
					toolbar2.add(startButton);
					readystatusLabel.setText("Ready");
					jtable.repaint();
				}
			}
		});
		//
		ipstartTextField.setText(fixed+1);
		ipEndTextFeild.setText(fixed+254);
		hostNameTextFeild.setText(myHostName);
		//
		setSize(700,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	private Object[][] initializeTanle() {
		Object[][] results = new Object[254][titles.length];
		return results;
	}
	private Object[][] getPingStats(String string) {
		Object[][] results = new Object[254][titles.length];
		for(int i=0;i<254;i++) {
			results[i][0] = string + (i+1);		
		}
		return results;
	}
	
	public static void main(String[] args) {
		PingOutLine po = new PingOutLine();
	}
}
