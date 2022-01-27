package com.Safety.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Safety.Model.Injury;
import com.Safety.Model.User;

public interface UserDAO extends JpaRepository<User,Integer> {

	

	//User save(User user);

}
