package com.pratyush.userservice.service;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import org.springframework.stereotype.Service;

import com.pratyush.userservice.entity.User;

@Service
public class userServiceImpl implements UserService {

	//fake User list
	List<User> list = Arrays.asList(new User(101L,"Pratyush","9999999999"),new User(102L,"Rajarshi Biswas","888888888"),new User(103L,"Rahul","888888889"),new User(104L,"abhi","808888889"));
	//stringList = Collections.unmodifiableList(stringList);
	

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}


	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return list;
	}
	 
}
