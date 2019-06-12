package cn.com.rmiclient;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import cn.com.rmiserver.entity.User;
import cn.com.rmiserver.server.RMIServerInterface;

public class ClientEntry {

	public static void main(String[] args) throws RemoteException, NotBoundException {
		
		Registry registry = LocateRegistry.getRegistry("192.168.40.70",2002);
		RMIServerInterface rmiInterface = (RMIServerInterface)registry.lookup("rmiInterface");
		
		User user = rmiInterface.getUserById("H99");
		
		System.out.println(user);
	}

}
