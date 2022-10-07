
public class StaticDemo extends Student {
	
	public StaticDemo(String name) {
		super(name);
	}


	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.setCllg("XYZ");

		Student s1 = new Student("Alice");
		Student s2 = new Student("Bob");

		s1.getStudentInfo();
		s2.getStudentInfo();
	}


	}


