package fr.tonelv.rateandco.controls.interfaces;

import java.util.ArrayList;

import fr.tonelv.rateandco.models.RateSession;
import fr.tonelv.rateandco.models.Session;

public interface IStudentControl {
	    
    RateSession getRateSessionById(Integer id);
	
	ArrayList<RateSession> getAllRateSessions();
		
	RateSession createRateSession(RateSession rateSession);
	
	Session updateRateSession(RateSession rateSession);
	
	
}
