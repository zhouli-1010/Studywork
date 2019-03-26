package corejava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.GregorianCalendar;


public class Employee  implements Comparable<Employee>, ActionListener, Cloneable{
	private String name;
	private double salary;
	private Date hireDate;
	
	public Employee(String n, double s){
		this.name = n;
		this.salary = s;
		this.hireDate = new Date();
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void raiseSalary(double byPt){
		double raise = salary * byPt / 100;
		salary += raise;
		
	}
	
	/*
	 * set hire day to a given date
	 * */
	public void setHireDate(int year, int month, int day){
		Date newHireday = new GregorianCalendar(year, month-1, day).getTime();
		hireDate.setTime(newHireday.getTime());
	}
	
	/*
	 * compareTo
	 * */
	public int compareTo(Employee other) {
		Employee otremp = other;
		return Double.compare(salary, otremp.salary);
	}

	/*
	 * ActionEvent
	 * */
	public void actionPerformed(ActionEvent e) {
		System.out.println("At the tone, time is" + new Date());
//		Toolkit.getDefaultToolkit().beep();
		
	}

	/*
	 * CloneNotSupportedException
	 * */
	public Employee clone() throws CloneNotSupportedException{
		Employee cloned = (Employee) super.clone();
		cloned.hireDate = (Date)hireDate.clone();
		return cloned;
	}

	
	/*
	 * Employee.toString
	 * */
	public String toString(){
		return "Employee[name= " + name + ",  salary= " + salary + ", hireDay= " + hireDate + "]";
	}
	

	/*
	 * Employee.hashCode
	 * */
	public boolean equals(Object otherobj){
		if(this == otherobj) return true;
		
		if(otherobj == null) return false;
		
		if(getClass() != otherobj.getClass()) return false;
		
		Employee other = (Employee) otherobj;
		return name.equals(other.name)
		  && salary == other.salary
		  && hireDate.equals(other.hireDate);
	}
	
	
	/*
	 * Employee.hashCode
	 * */
	public int hashCode (){
		return 0;
	}
	

}
