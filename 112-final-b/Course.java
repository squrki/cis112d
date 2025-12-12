import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster; // collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}

	public ArrayList<Student> getDeansList() {
		ArrayList<Student> deansList = new ArrayList<>();
		for (Student s : roster) {
			if (s.getGPA() >= 3.5) {
				deansList.add(s);
			}
		}
		return deansList;
	}

	public void addStudent(Student s) {
		roster.add(s);
	}
}