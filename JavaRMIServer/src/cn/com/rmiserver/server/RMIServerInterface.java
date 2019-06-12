package cn.com.rmiserver.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import cn.com.rmiserver.entity.User;

/**
 * 
 * @author Administrator
 *
 */
public interface RMIServerInterface extends Remote {
	public User getUserById(String userId) throws RemoteException;
}
