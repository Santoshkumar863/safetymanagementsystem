package com.Safety.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.Safety.Model.Injury;
import com.Safety.Model.User;
import com.Safety.Repository.UserDAO;
@Service
public class UserServiceimpl implements UserService{
	@Autowired
	UserDAO dao;
	    @Override
	    public User addUser(User user) {
	        // TODO Auto-generated method stub
	    User inc=dao.save(user);
	    return inc;
	    }
		//@Override
//		public Optional<User> findByUserId(int userId) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		@Override
//		public Injury updateInjury(int userId, User user) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		@Override
//		public Optional<User> findByInjuryId(int id) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		@Override
//		public List<User> findallUser() {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		@Override
//		public User updateUserid(int userId, User user) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		@Override
//		public User updateUser(int userId, User user) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//		

		
}