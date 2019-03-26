package corejava;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class TalkingClock {
	private int interval;
	private boolean beep;
	
	/*
	 *Constructs a talking clock 
	 */
	public TalkingClock(int interval, boolean beep){
		this.interval = interval;
		this.beep = beep;
	}
	

	/*
	 * 
	 */
	public void start(){

		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
	}
	
		
	/*
	 * 
	 */
	private class TimePrinter implements ActionListener{
		public void actionPerformed(ActionEvent e) {

			System.out.println("At the tone, the time is " + new Date());
//			if (beep) Toolkit.getDefaultToolkit().beep();
//			if (TalkingClock.this.beep) System.out.println("BEEP");
			
		}
		
	}


}
