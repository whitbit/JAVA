package pwir_l_05_06d.view;
import pwir_l_05_06d.controller.Company;

public class Startup {
	public static void main( String[] args ) {
		Company company = new Company( /*Cars value*/20, /*Deliverer value*/10 );
		company.carsGoToWork();
	}
}
