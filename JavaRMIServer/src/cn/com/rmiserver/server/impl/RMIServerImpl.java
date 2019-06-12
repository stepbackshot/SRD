package cn.com.rmiserver.server.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import cn.com.rmiserver.entity.User;
import cn.com.rmiserver.server.RMIServerInterface;

public class RMIServerImpl implements RMIServerInterface {

	List<User> users = new ArrayList<User>();
	{
		for(int i = 0; i < 100; i++) {
			User user = new User();
			user.setUserId("H"+i);
			user.setUserName("Ô±¹¤"+i);
			user.setAge(i+1);
			
			users.add(user);
		}
	}
	
	@Override
	public User getUserById(String userId) throws RemoteException {
		for(User user:users) {
			if(userId.equals(user.getUserId())) {
				return user;				
			}
		}
		return null;
	}

}
