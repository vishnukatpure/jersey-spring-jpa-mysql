package org.demo.tutorial.dao;

import org.demo.tutorial.entity.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public interface UserDAO {

	
	public User addUser(User user);
	public User getUser(long userId);
	public User getUser(String email);
}
