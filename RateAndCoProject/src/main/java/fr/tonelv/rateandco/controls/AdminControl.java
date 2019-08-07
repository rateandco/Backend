package fr.tonelv.rateandco.controls;

import java.util.ArrayList;

import fr.tonelv.rateandco.controls.interfaces.IAdminControl;
import fr.tonelv.rateandco.models.Course;
import fr.tonelv.rateandco.models.Session;
import fr.tonelv.rateandco.models.User;

public class AdminControl implements IAdminControl{
	
	@Override
	public Session createSession(Session session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session updateSession(Session session) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteSession(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public User createUser(User user, String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user, String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
//	@Override
//	public User CreateStudent() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public User UpdateStudent() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public User CreateTrainer() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public User UpdateTrainer() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Boolean DeleteStudent() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Boolean DeleteTrainer() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	

	@Override
	public Course getCourseById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getCourseByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Course createCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteCourse(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
