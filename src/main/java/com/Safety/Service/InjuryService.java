package com.Safety.Service;

import java.util.Optional;
import java.util.List;

//import com.Safety.Contoller.Injury;
import com.Safety.Model.Injury;
import com.Safety.Model.User;

public interface InjuryService {
	
	Injury addInjury(Injury injury) ;
		
		List<Injury> findallInjury();
		Optional<Injury> findByIncidentId(int injuryId);
		Injury updateInjury(int injuryId,Injury injury);
	

	//List<Injury> findallInjury();

	Optional<Injury> findByInjuryId(int id);

	User addUser(User user);

	//Optional<User> findByUserId(int userId);

	List<User> findallUser();

	//Optional<User> findByUserId(int userId);

	
}
