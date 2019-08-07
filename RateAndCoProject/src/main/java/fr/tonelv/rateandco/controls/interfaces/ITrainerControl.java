package fr.tonelv.rateandco.controls.interfaces;
import java.util.ArrayList;

import fr.tonelv.rateandco.models.RateStudent;
import fr.tonelv.rateandco.models.Session;

public interface ITrainerControl {

	RateStudent getRateStudentById(Integer id);
	
	ArrayList<RateStudent> getAllRateStudents();
		
	RateStudent createRateStudent(RateStudent rateStudent);
	
	Session updateRateSudent(RateStudent rateStudent);
	
}
