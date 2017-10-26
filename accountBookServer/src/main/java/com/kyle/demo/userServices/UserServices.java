package com.kyle.demo.userServices;

import java.util.List;

public interface UserServices {

	public String createUser(String username, String password) throws Exception;
	public String loginUser(String username, String password);
	public List<Object> showAll();
}
