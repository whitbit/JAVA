package pwir_l_05_06d.model;
import java.util.Random;

public class Customer {
	private String[] companyNamesOfCustomerList = { "DHL", "DB Schenker", "Ceva Logistics", "Nippon Express", "C.H. Robinson", "ING Group", 
			"General Motors", "Hewlett-Packard", "Carrefour", "Siemens AG" };
	private String companyNamesOfCustomer = null;
	private int position = 0;
	
	public Customer() {
		setCompanyNameOfCustomer();
		setPosition();
	}	
	private void setCompanyNameOfCustomer() {
		Random generateCharOfInitial = new Random();
		int companyNameID = generateCharOfInitial.nextInt( companyNamesOfCustomerList.length );
		companyNamesOfCustomer = companyNamesOfCustomerList[ companyNameID ];
	}
	public String getCompanyNameOfCustomer() {
		return companyNamesOfCustomer;
	}
	public int getPosition() {
		return position;
	}
	private void setPosition() {
		Random generatePosition = new Random();
		int position = generatePosition.nextInt( 100 );
		this.position = position;
	}
}
