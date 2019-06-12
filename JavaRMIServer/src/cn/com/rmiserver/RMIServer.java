package cn.com.rmiserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import cn.com.rmiserver.server.RMIServerInterface;
import cn.com.rmiserver.server.impl.RMIServerImpl;

public class RMIServer {

	public static void main(String[] args) throws RemoteException {
		
		RMIServerImpl rmiServer = new RMIServerImpl();
		RMIServerInterface rmiInterface = 
				(RMIServerInterface) UnicastRemoteObject.exportObject(rmiServer, 0);
		Registry registry = LocateRegistry.createRegistry(2002);
		
		registry.rebind("rmiInterface", rmiInterface);
		
		System.out.println("server is ready");
	}

}
