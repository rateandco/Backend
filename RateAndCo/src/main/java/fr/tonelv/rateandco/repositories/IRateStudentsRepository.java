package fr.tonelv.rateandco.repositories;

import java.util.ArrayList;

import fr.tonelv.rateandco.models.RateStudent;
import fr.tonelv.rateandco.models.Session;

public interface IRateStudentsRepository {

	RateStudent getRateStudentById(Integer id);
	
	ArrayList<RateStudent> getAllRateStudents();
		
	RateStudent createRateStudent(RateStudent rateStudent);
	
	Session updateRateSudent(RateStudent rateStudent);
	
}
