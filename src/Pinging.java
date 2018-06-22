import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Pinging extends Thread {
	private Object[] msg;
	private String ip;
	private ImageIcon questionIcon = new ImageIcon(System.getProperty("user.dir") + "\\src\\searching.png");
			
	private ImageIcon pingokIcon = new ImageIcon(System.getProperty("user.dir") + "\\src\\ok.png");
	
	private ImageIcon pingnoopIcon = new ImageIcon(System.getProperty("user.dir") + "\\src\\noop.png");

	
	
	public Pinging(String ip,Object[] msg) {
		this.ip=ip;
		this.msg=msg;
		
	}
	@Override
	public void run() {
		BufferedReader br = null;
		try {
			JLabel questionLabel = new JLabel(ip);
			JLabel pingokLabel = new JLabel(ip);
			JLabel pingnoopLabel = new JLabel(ip);
			questionLabel.setIcon(questionIcon);
			pingokLabel.setIcon(pingokIcon);
			pingnoopLabel.setIcon(pingnoopIcon);
			Runtime runtime = Runtime.getRuntime();
			Process process = runtime.exec("ping -a "+ip);
			msg[0] = questionLabel;
			msg[1] = null;
			msg[2] = null;
			msg[3] = null;
			msg[4] = null;
			br = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String lineinput = null;
			while ((lineinput = br.readLine()) != null) {
				if(lineinput.indexOf("[")>=0) {
					msg[3] = lineinput.substring(5,lineinput.indexOf("[")-1);
				}
				if(lineinput.indexOf("ms")>=0) {
					msg[1] = lineinput.substring(0,lineinput.indexOf("ms") + 2);
					msg[1] = ((String)msg[1]).substring(((String)msg[1]).lastIndexOf("=")+1);
					if(msg[1].toString().length() > 6) {
						msg[1] = ((String)msg[1]).substring(((String)msg[1]).lastIndexOf("<"));
					}
					msg[2] = lineinput.substring(lineinput.indexOf("TTL=")+4);
					msg[0] = pingokLabel; 
					break;
					
				}
			}
			if (msg[1] == null) {
				msg[1] = "[n/a]";
				msg[0] = pingnoopLabel;
			}
			if (msg[2] == null) msg[2] = "[n/s]";
			if (msg[3] == null) msg[3] = "[n/s]";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public Object[] getMsg() {
		try {
			join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	
}
