package fr.tonelv.rateandco.repositories;

import java.util.ArrayList;

import fr.tonelv.rateandco.models.Session;



public interface ISessionRepository {
	
	Session getSessionById(Integer id);
	
	ArrayList<Session> getAllSessions();
		
	Session createSession(Session session);
	
	Session updateSession(Session session);
	
	Boolean deleteSession(Integer id);
	

}
