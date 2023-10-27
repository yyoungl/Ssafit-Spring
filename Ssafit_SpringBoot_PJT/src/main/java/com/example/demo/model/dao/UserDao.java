package com.example.demo.model.dao;
import java.util.List;
import com.example.demo.model.dto.User;

public interface UserDao {

	List<User> selectAll();

	int insertUser(User user);
	
	User selectOne(String id);
	
}
