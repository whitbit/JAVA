package pwir_l_07_08d.model;

public class GasStation {
	private int distanceToEndPoint;
	private int distanceToNextGasStation;
	
	public GasStation( int distanceToEndPoint ) {
		setDistanceToEndPoint( distanceToEndPoint );
	}
	
	public int getDistanceToEndPoint() {
		return distanceToEndPoint;
	}
	public void setDistanceToEndPoint( int distanceToEndPoint ) {
		this.distanceToEndPoint = distanceToEndPoint;
	}
	public int getDistanceToNextGasStation() {
		return distanceToNextGasStation;
	}
	public void setDistanceToNextGasStation( int distanceToNextGasStation ) {
		this.distanceToNextGasStation = distanceToNextGasStation;
	}		
}
