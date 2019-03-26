package corejava;

import java.util.Comparator;

public class Lengthcomparator implements Comparator<String>{

	public int compare(String s1, String s2) {

		return s1.length() - s2.length();
	}

}
