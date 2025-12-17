package eDUSmart;

interface ProgressTrackable
{
void trackProgress();	
}

abstract class User
{
	private String name;
	private String email_id;
	private int user_id;
	
	abstract void viewProfile();
	User(String name,String email_id,int user_id)
	{
		this.name=name;
		this.email_id=email_id;
		this.user_id=user_id;
		System.out.println("user name is:" + name );
		System.out.println("user email_id is:" + getEmail_id());
		System.out.println("user is is:" + getuser_id());		
		
	}
	
	final void displayWelcome()
	{
		System.out.println("WelcometoEdusmart");
	}
	public String getName() {
		return name;
	}
	public String getemail_id() 
	{
		return getEmail_id();
	}
	public int getuser_id()
	{
		return user_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
}
 class Student extends User implements ProgressTrackable
{
	 String enrolledCourse1;
	 String enrolledCourse2;
	 
	public Student(String name,String email_id,int user_id )
	 {
		 super(name,email_id,user_id);
	 }

	 void enrollCourse(String courseName)
	 {
		 System.out.println("Enrolled in course");
	 }
	 public void viewProfile() 
		{
			System.out.println("view profile");
		}
	 
	public void trackProgress() 
	 {
		System.out.println("track in progress"); 
	 }
}
 
class Instructor extends User
{


	Instructor(String name, String email_id, int i) 
	{
		super(name, email_id, i);
	}
	private String createdCourse;
	
	@Override
	void viewProfile() 
	{
		System.out.println("Dispaly view profile");
		
	}
	 void createCourse(String createdCourse)
	 {
		System.out.println("CourserName is:"+ createdCourse);
	
	}
	 	
}
class Admin extends User
{
	Admin(String name, String emild_id, int user_id) 
	{
		super(name, emild_id, user_id);
		
	}
	void removeUser(User user)
	{
		System.out.println("Remove username");
	}
	@Override
	void viewProfile() 
	{
		System.out.println("Dispaly view profile");
		
	}
}
class Course
{
	String title; 
	int durationInHours; 
	final int maxStudents;
	
	Course(String title, int durationInHours , int maxStudents)
	{
		this.maxStudents=maxStudents;
		
	}
	 void showCourseDetails() 
	 {
		System.out.println("Show course Deatils"); 
	 }	 
			
	
}

public class Edusmart {

	public static void main(String[] args) 
	{
		Student s1 = new Student("Reena", "reena@mail.com", 101);
	     Student s2 = new Student("Meena", "meena@mail.com", 102);

	     // Create instructors
	     Instructor i1 = new Instructor("pavi", "pavi@mail.com", 201);
	     Instructor i2 = new Instructor("ramya", "ramya@mail.com", 202);

	     // Admin
	     Admin admin = new Admin("Admin", "admin@mail.com", 1);

	     // Instructors create courses
	     i1.createCourse("English");
	     i1.createCourse("Hindi");
	     i2.createCourse("Science");
	     i2.createCourse("History");

	     // Students enroll
	     s1.enrollCourse("English");
	     s1.enrollCourse("Hindi");
	     s2.enrollCourse("History");

	     // View profiles
	     s1.viewProfile();
	     s2.viewProfile();
	     i1.viewProfile();
	     i2.viewProfile();
	     admin.viewProfile();

	     // Track progress
	     s1.trackProgress();

	     // Admin actions
	     admin.removeUser(s2);

	     // Courses
	     Course c1 = new Course("Zoology", 40, 100);
	     Course c2 = new Course("Mathmatics",50,90);
	     c1.showCourseDetails();
	     c2.showCourseDetails();

	}

}
