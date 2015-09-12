package RMITestMeeting;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Meeting extends Remote
{
	public String getDate()
   	throws RemoteException;
      
   public void setDate(String data)
   	throws RemoteException;
} 