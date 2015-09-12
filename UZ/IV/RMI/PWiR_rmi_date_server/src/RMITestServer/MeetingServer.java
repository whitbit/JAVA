package RMITestServer;

import RMITestMeeting.Meeting;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MeetingServer extends UnicastRemoteObject implements Meeting {
   /**
    *
    */
   private static final long serialVersionUID = 1L;
   private Date date =  new Date() ;
   private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

   public MeetingServer() throws RemoteException {
   }

   public String getDate() throws RemoteException {
      return simpleDateFormat.format(date, new StringBuffer(), 
              new FieldPosition(0)).toString();
   }

   public void setDate(String date) throws RemoteException {
	   try{
	   this.date = (Date)simpleDateFormat.parse(date);
	   }catch(ParseException e){
		   throw new RemoteException("zly format daty! \npoprawny format: dd-MM-yyyy");
	   }

   }

   public static void main(String[] args) throws Exception {
      System.setSecurityManager(new RMISecurityManager());

      MeetingServer ms = new MeetingServer();

      Naming.rebind("rmi://127.0.0.1/Meeting", ms);
      System.out.println("Serwer wystartowal !!! ");
   }
}
