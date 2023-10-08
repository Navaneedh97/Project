package javaProgram;
class EncapsulationDemo{
	private int ssn;
	private String stuName;
	private int stuAge;
	
	//Getter and setter method
	
	public int getStuSSN() {
		return ssn;
	}
	
	public String getStuName() {
		return stuName;
    }
	
	public int getStuAge() {
		return stuAge;
		
	}
	
	public void setStuAge(int newValue) {
		stuAge=newValue;
	}
	
	public void setStuName(String newvalue) {
		stuName= newvalue;
	}
	
	public void setStuSSN(int newvalue) {
		ssn= newvalue;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo Obj=new EncapsulationDemo(); 
		
		Obj.setStuName("Navanee");
		Obj.setStuAge(20);
		Obj.setStuSSN(423651);
		
		System.out.println("Student Name: " + Obj.getStuName());
		System.out.println("Student SSN: " + Obj.getStuSSN());
		System.out.println("Student Age: " + Obj.getStuAge());
	}

	}


