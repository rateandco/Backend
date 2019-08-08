package fr.tonelv.rateandco.repositories;

import java.util.ArrayList;
import java.sql.Connection;

import fr.tonelv.rateandco.models.Course;

public class CourseRepository implements ICourseRepository {
	private Connection conn;
	
	
	
	@Override
	public Course Create(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course Get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course Update(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Course> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
