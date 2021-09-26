package september24;

public class A {
	private int studentRollNo;
	private String studentName;
	private int studentClass;
	private int studentAge;
	private String studentCity;
	
	public A(int studentRollNo, String studentName, int studentClass, int studentAge, String studentCity) {
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentAge = studentAge;
		this.studentCity = studentCity;
	}
	
	public A() {
		
	}
	public void show() {
		System.out.println("Id :"+ this.studentRollNo + " Name "+ this.studentName+ " Class "+this.studentClass+" Age "+this.studentAge+" City "+this.studentCity);
	}
	

}
