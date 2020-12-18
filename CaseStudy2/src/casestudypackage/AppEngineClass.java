package casestudypackage;
import java.util.*;
import java.time.LocalDate;
public class AppEngineClass {
	ArrayList<Course> cl=new ArrayList<>();
	ArrayList<Student> sl=new ArrayList<>();
	ArrayList<Enroll> el=new ArrayList<>();
	
	public void introduce(Course course) {
		cl.add(course);
    }
	public void register(Student student) {
		sl.add(student);
    }
	public ArrayList<Student> listOfStudents() {
		return sl;
    }
	public ArrayList<Course> listOfCourses() {
		return cl;
    }
	public void enroll(Student student, Course course) {
		LocalDate date = LocalDate.now(); 
		Enroll e=new Enroll(student,course,date);
		el.add(e);
    }
	public ArrayList<Enroll> listOfEnrollments() {
		return el;
    }
}
