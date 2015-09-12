package RMITestClient;

import RMITestMeeting.Meeting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.rmi.*;


public class MeetingClient {
   public static void main(String[] args) {
      try {
         System.setSecurityManager(new RMISecurityManager());

         Remote r = Naming.lookup("rmi://127.0.0.1/Meeting");

         String s = null;
         Meeting ms;

         if (r instanceof Meeting) {
            ms = (Meeting) r;
            s = ms.getDate();
            System.out.println("Data z systemu zdalnego: " + s);
            System.out.print("\n\nPodaj Date (dzien-miesiac-rok):");

            BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
            String line = bis.readLine();
            ms.setDate(line);
            System.out.println("\n\nDate zmieniono !!!!\n\n");
            System.out.println("Data z systemu zdalnego: " + ms.getDate() + "\n\n");

            bis.readLine();
         }
      } catch (java.rmi.NotBoundException nbe) {
         nbe.printStackTrace();
      } catch (RemoteException re) {
         re.printStackTrace();
      } catch (java.net.MalformedURLException mue) {
         mue.printStackTrace();
      } catch (java.io.IOException ioe) {
         ioe.printStackTrace();
      }
   }
}
