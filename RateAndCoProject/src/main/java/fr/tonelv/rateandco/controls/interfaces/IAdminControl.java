package fr.tonelv.rateandco.controls.interfaces;

import java.util.ArrayList;

import fr.tonelv.rateandco.models.Course;
import fr.tonelv.rateandco.models.Session;
import fr.tonelv.rateandco.models.User;

public interface IAdminControl {

	public Session createSession(Session session);

	public Session updateSession(Session session);

	public Boolean deleteSession(Integer id);
	
	public User getUserById(Integer id);
	
	public User getUserByName(String lastName);
	
	public User createUser(User user, String role);
	
	public User updateUser(User user, String role);
	
	public Boolean deleteUser(Integer id);

//	public User CreateStudent();
//
//	public User UpdateStudent();
//
//	public User CreateTrainer();
//
//	public User UpdateTrainer();
//
//	public Boolean DeleteStudent();
//
//	public Boolean DeleteTrainer();

	public Course createCourse(Course course);

	public Course updateCourse(Course course);

	public Boolean deleteCourse(Integer id);
	
	public Course getCourseById(Integer id);
	
	public Course getCourseByName(String name);
	
	public ArrayList<Course> getAllCourses();

}
