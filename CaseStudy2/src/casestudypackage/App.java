package casestudypackage;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello!!Code is changed!!!!!!!!!");
		System.out.println("Change From Second User");
		Course  c1=new Course(1,"java");
		Course c2=new Course(2,"dbms");
		Course c3=new Course(3,"Angular");
		ArrayList<Course> cl=new ArrayList<>();
		ArrayList<Student> sl=new ArrayList<>();
		ArrayList<Enroll> el=new ArrayList<>();
		AppEngineClass obj=new AppEngineClass();
		obj.introduce(c1);
		obj.introduce(c2);
		obj.introduce(c3);
		Student s1=new Student(1,"asra",21);
		Student s2=new Student(2,"uday",21);
		Student s3=new Student(3,"vini",22);
		obj.register(s1);
		obj.register(s2);
		obj.register(s3);
		sl=obj.listOfStudents();
		obj.enroll(s1,c1);
		obj.enroll(s2, c2);
		obj.enroll(s3, c1);
		cl=obj.listOfCourses();
		el=obj.listOfEnrollments();
		System.out.println("Student Details");
		for(Student s:sl)
		{
			System.out.println("id "+s.getSid());
			System.out.println("name "+s.getSname());
			System.out.println("age "+s.getAge());
		}
		System.out.println("Course Details");
		for(Course c:cl)
		{
			System.out.println("id "+c.getCid());
			System.out.println("name "+c.getCname());
		}
		System.out.println("Enrollment Details");
		for(Enroll e:el)
		{
			Course c=e.getCourse();
			Student s=e.getStudent();
			LocalDate ld=e.getEnrollmentDate();
			System.out.println(s.getSid());
			System.out.println(s.getSname());
			System.out.println(s.getAge());
			System.out.println("id "+c.getCid());
			System.out.println("name "+c.getCname());
			System.out.println("registered date "+ld);
		}
	}
}
