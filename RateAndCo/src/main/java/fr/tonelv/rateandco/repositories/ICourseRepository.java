package fr.tonelv.rateandco.repositories;

import java.util.ArrayList;

import fr.tonelv.rateandco.models.Course;


public interface ICourseRepository {

	Course createCourse(Course course);
	
	Course updateCourse(Course course);
	
	Boolean deleteCourse(Integer id);
	
	Course getCourseById(Integer id);
	
	Course getCourseByName(String name);
	
	ArrayList<Course> getAllCourses();
	
	
}
