package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentJames = new Student(100,"James");
		studentJames.setKorea(100);
		studentJames.setMath( 90);
		
		Student studentTomas = new Student(101,"Tomas");
		studentTomas.setKorea( 90);
		studentTomas.setMath( 100);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();
	}

}
