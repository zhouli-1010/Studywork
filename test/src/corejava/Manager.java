package corejava;

public class Manager extends Employee {
	
	private double bonus;

	public Manager(String n, double s) {
		super(n, s);
		// TODO Auto-generated constructor stub
		bonus = 0;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getSalary() {
		double bsalary = super.getSalary();
		return bsalary + bonus;
	}

	public boolean equals(Object otrobj){
		if (!super.equals(otrobj)) return false;
		Manager other = (Manager) otrobj;
		return bonus == other.bonus;
	}

}
