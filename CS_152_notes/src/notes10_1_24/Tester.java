package notes10_1_24;

public class Tester {
	public static void main(String[] args) {
		
		Student st1 = new Student ("Mike", 1001234, 3.4);
		Student st2 = new Student ("David",1001235);
		Student st3 = new Student ("John", 1001236);
		
		
		System.out.println(st1.getName());
		System.out.println(st2.getName());
		System.out.println(st3.getName());
		
		System.out.println(st1.getid());
		System.out.println(st2.getid());
		System.out.println(st3.getid());

		System.out.println(st1.getName() +  " " + st1.getid()); 
		
		System.out.println(st3.toString());
		System.out.println(st3);

		// st1.uname = "Hello";
		
		
		System.out.println(st1.uname);
		System.out.println(st2.uname);
		System.out.println(Student.uname);

				
		
	}
}


