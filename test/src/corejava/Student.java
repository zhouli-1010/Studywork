package corejava;

public class Student extends Person{
	
	private String major;
	
	public Student (String name, String major){
		super(name);
		this.major = major;
	
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Student" + major ;
	}

}
