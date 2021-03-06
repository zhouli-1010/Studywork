package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;


public class firsttest  {
	
	enum Weekday {Monday,Tuesday,Sunday};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
//		int x = digitCounts( 1, 12 );
//		System.out.println(x);
//		allEmp();
		
//		String s1 = "ACD";
//		String s2 = "AD";
//		if(compstring (s1,s2)){
//			System.out.println("OK");
//		}else{
//			System.out.println("NG");

		
//		String[] s ={"lint","intl","inlt","code"};
//		List<String> ns = new ArrayList<String>();
//
//		ns = anagrams(s);
//		if(ns != null && ns.size() != 0) {
//		  for(String x : ns){
//			  System.out.println(x);
//		  }	
//		}else{
//			
//			  System.out.println("Sorry");
//		}
		
//		maptest();
		
//		testClone();
		
//		TalkingClock clock = new TalkingClock(1000, true);
//		clock.start();
//		
//		JOptionPane.showMessageDialog(null, "Quit?");
//		System.exit(0);
//		ja10_hashcode();
		int ta[] = {1,2};
		int i = initTargetHash(ta,"abc");
		
}

	
    public static int initTargetHash(int []targethash, String Target) {
        int targetnum =0 ;
        for (char ch : Target.toCharArray()) {
            targetnum++;
            targethash[ch]++;
        }
        return targetnum;
    }
  
	
	
	/*
	 * Maptest
	 * */
	public static void maptest(){
		//test for HashMap
		Map<String, Employee> staff = new HashMap<String, Employee>();
		staff.put("144", new Employee("Amy",1000));
		staff.put("567", new Employee("Harry",2000));
		staff.put("157", new Employee("Gary",3000));
		staff.put("456", new Employee("Francesca",5000));	
		
		System.out.println(staff);
//		staff.remove("456");
		System.out.println(staff.get("157"));
		System.out.println(staff.get("456").toString());
		
		System.out.println("TEST1-------------------------------");
		//***test for itorator
		for(Iterator<String> itor = staff.keySet().iterator(); itor.hasNext();){
			String key = itor.next();
			System.out.println( "staff:" + key + "��" + staff.get(key));
		}
		System.out.println("TEST2-------------------------------");
		
		//***
		for(Entry<String, Employee> entry: staff.entrySet()){
			System.out.println("staff entryset :" + entry.getKey() + "��" + entry.getValue());
		}

		
		//test for EnumSet
		System.out.println("TEST Enum-------------------------------");		
		EnumSet<Weekday> workday = EnumSet.range(Weekday.Monday, Weekday.Sunday);
		System.out.println(workday.toString());	
		System.out.println();
		
		//test for Collections 
		List<String> lststr = Collections.nCopies(100, "DEFULT");
		for (Entry<String,Employee> e : staff.entrySet()){
			//TODO: do sth.
		}

		//test for Sort
		System.out.println("TEST Collection Sort-------------------------------");		
		List<String> lstkey =  new ArrayList(staff.keySet());
		Collections.sort(lstkey);
		System.out.println(lstkey.size());
		
//		for(String s : lstkey.subList(1, 3)){
//			System.out.println(s);
//		}
		
		Employee e = new Employee("Therasa", 10000000);
		if (e instanceof Comparable){
			System.out.println("instanceof Comparable");
		}

// test for lisenter		
//		ActionListener listener = new Worker();
//		Timer t = new Timer( 10000, listener );
//		JOptionPane.showMessageDialog(null, "Do quit the program?");
//		t.start();
		
		System.out.println("Print Using Comparator---------------------------");
		Lengthcomparator comp = new Lengthcomparator();
		String[] friends = {"Paul","Marier","Peter"};
		Arrays.sort(friends, comp);
		for(String s : friends){
			
			System.out.print(s + ",  ");
		}
		System.out.println();
		System.out.println();
				
		System.out.println("Print Without Comparator---------------------------");		
		Arrays.sort(friends);
		for(String s : friends){
			System.out.print(s + ",  ");
		}
		System.out.println();
		System.out.println();}
	

	
	/*
	 * test for clone.exception
	 * */
	public static void testClone(){

		try{
			Employee org = new Employee("John Q. Public", 50000);
			org.setHireDate(2000, 1, 1);
			Employee cpy = org.clone();
			cpy.raiseSalary(10);
			cpy.setHireDate(2002, 12, 31);
			System.out.println("org=" + org);
			System.out.println("cpy=" + cpy);
		} catch (CloneNotSupportedException ex){
			ex.printStackTrace();
		}

		
	}

	
	
    /**
     * @param n: An integer
     * @param nums: An array
     * @return: the Kth largest element
     */
    public static int kthLargestElement(int n, int[] nums) {
        // write your code here
    	if (n == 0 || nums.length == 0) return 0;
    	List<Integer> lstint = new ArrayList<Integer>();
    	
        return 0;
    }
	
	
/*
 * Anagram
 *   input :["lint","intl","inlt","code"]
 *   output:["lint","inlt","intl"]
 *
 */
public static List<String> anagrams(String[] strs) {
	
        List<String> result = new ArrayList<String>();
       
        if (strs == null || strs.length == 0) {
            return result;
        }
        
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray(); 
            Arrays.sort(arr);
            String s = String.valueOf(arr);
            if (!map.containsKey(s)) {
                ArrayList<String> list = new ArrayList<String>();
                map.put(s, list);
            }
            map.get(s).add(strs[i]);
        }
        
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            if (entry.getValue().size() >= 2) {
                result.addAll(entry.getValue());
            }
        }
        return result;
    }
	
/*
 * DigitCounts
 *�@if n = 12, k = 1 in 
 *  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12] 
 *  we have FIVE 1's (1, 10, 11, 12)
 *
 */
    public static int digitCounts(int k, int n) {
    	int[] x = new int[n+1];
    	int cnt = 0;
    	String s1 = "";
    	
    	for (int i = 0 ;i <= n ; i++) {
    	 	x[i] = i;
    	}
    
    
		for (int i = 0 ;i <= n ; i++) {
    		s1 = String.valueOf( x[i] );
    		
    		for (int j= 0 ; j < s1.length(); j++){
    			if(s1.equals(String.valueOf(k))){
    				cnt = cnt + 1;
    			}
    		}
	    }
		return cnt;
    }
    
    
    /*
     * Compare Strings
     *   Compare two strings A and B, determine whether A contains all of the characters in B.
     *   The characters in string A and B are all Upper Case letters.
     *
     */
        public static boolean compstring(String A, String B){
            int[] counts = new int[26];
            for (int i = 0; i < 26; i++) {
                counts[i] = 0;
            }
            for (int i = 0; i < A.length(); i++) {
                counts[A.charAt(i) - 'A'] ++;
            }
            for (int i = 0; i < B.length(); i++) {
                counts[B.charAt(i) - 'A'] --;
                if (counts[B.charAt(i) - 'A'] < 0) {
                    return false;
                }
            }
            return true;
        }
    
    
    /*
     * 
     * 
     * */
    public void myEmployee(){
    	Employee[] staff = new Employee[3];
    	Employee e = new Employee("Harry", 1000.10);
    	
    }
    
    /*  
     * 
     * 
     * */
    public static void allEmp(){
    	Manager Ma = new Manager("boss",5000);
    	Ma.setBonus(500);
    	
    	Employee[] s = new Employee[2];
    	s[0] = Ma;
    	s[1] = new Employee("e1",200);
    	
    	for(Employee e : s){
    		System.out.println(e.getName()+" = "+e.getSalary());
    	}
    }
    
    /*
     * 
     * 
     * */
    public static void ja10_hashcode(){
    	String s = "OK";
    	StringBuilder sb = new StringBuilder(s);
    	System.out.println(s.hashCode() + " " + sb.hashCode());
    	
    	String t = new String("OK");
    	StringBuilder tb = new StringBuilder(t);
    	System.out.println(t.hashCode() + " " + tb.hashCode());
    }
    
    


}
