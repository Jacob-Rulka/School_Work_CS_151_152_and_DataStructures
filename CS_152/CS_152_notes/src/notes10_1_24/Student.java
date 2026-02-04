package notes10_1_24;

public class Student {
	
	final static String uname = "CCSU";
	
	
	
	private String name; // Property of instance / object // private property, 
	private int studentid;
	private double totalScores;

	
	public Student() {
		
	}
	
	
	
	public Student(String name, int id, double gpa){
		System.out.println("Hello");
		this.name = name;
		this.studentid = id;
		this.totalScores = gpa;
	}
	
	public Student(String name, int id){
		System.out.println("World");
		this.name = name;
		this.studentid = id;
	}
	
	
	
	// Behavior -> Setter / Mutator method
	
	//void changeName(String name) {
	public void setName(String name) {
		this.name = name; // or name = newname; (if it is String newname) but using "this" is safer
	}
	
	
	public void setScore (int totalScores) {
		this.totalScores = totalScores;
	}
	
	
	// Getter / Accessor mathod
	String getName() {
		return this.name;
	}
	
	public int getid() {
		return this .studentid;
	}
	
	public double getScore() {
		return this.totalScores;
	}
	
	public String toString() {     // method overideing
		return "name:" + this.name + " id:" + this.studentid + " GPA:" + this.totalScores;
	}
	
	
	}
	
	
