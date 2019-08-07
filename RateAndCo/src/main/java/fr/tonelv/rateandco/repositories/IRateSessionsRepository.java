package fr.tonelv.rateandco.repositories;

import java.util.ArrayList;

import fr.tonelv.rateandco.models.RateSession;
import fr.tonelv.rateandco.models.Session;

public interface IRateSessionsRepository {
	
	RateSession getRateSessionById(Integer id);
	
	ArrayList<RateSession> getAllRateSessions();
		
	RateSession createRateSession(RateSession rateSession);
	
	Session updateRateSession(RateSession rateSession);
	
	// Boolean deleteRateSession(Integer id);
	
	
}
