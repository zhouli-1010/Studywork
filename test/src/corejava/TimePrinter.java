package corejava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimePrinter implements ActionListener{

	public void actionPerformed(ActionEvent e) {
	
		System.out.println("At the tone, time is" + new Date());
//		Toolkit.getDefaultToolkit().beep();
	}

}
