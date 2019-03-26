package lambda;

import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.Timer;



public class LambdaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] planets = new String[] {"Mercury", "Venus", "Venus", "Venus", 
				"Jupiter", "Saturn", "Uranus", "Nepture" };
		System.out.println(Arrays.toString(planets));
		
		//
		System.out.println("Sorted in dictionary order");
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));
		
		//
		System.out.println("Sorted in dictionary order");
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));
		
//		//
//		Timer t = new Timer(1000, event->
//		  System.out.println("The time is" + new Date()));
//		t.start();
		
		//
		JOptionPane.showMessageDialog( null, "Quit program?");
		System.exit(0);

	}

}
