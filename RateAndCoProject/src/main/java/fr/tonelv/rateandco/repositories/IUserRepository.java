package fr.tonelv.rateandco.repositories;

import fr.tonelv.rateandco.models.User;

public interface IUserRepository {
	
	User createUser(User user);
		
	User updateUser(User user);
	
	Boolean deleteUser(Integer id);
	
	User getUserById(Integer id);
	
	User getUserByName(String lastName);
	
	
}
