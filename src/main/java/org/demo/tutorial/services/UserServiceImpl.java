package org.demo.tutorial.services;


import java.util.Date;

import org.demo.tutorial.dao.UserDAO;
import org.demo.tutorial.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.DEFAULT)
public class UserServiceImpl implements UserService {

	
	@Autowired(required=true)
	private UserDAO userDAO;
	
	
	public User getUser(long userId) {
		return userDAO.getUser(userId);
	}

	public User getUser(String email) {
		return userDAO.getUser(email);
	}

	public User addUser(String firstName,String lastName,String email,String sex,String password) {
		
		User user = new User();
		user.setCreateDate(new Date());
		user.setUpdatedDate(new Date());
		user.setEmail(email);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setSex(sex);
		user.setPassword(password);
		
		
		
		return userDAO.addUser(user);
	}


}
