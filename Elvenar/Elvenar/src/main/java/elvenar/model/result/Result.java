package elvenar.model.result;
/**
 * Enumeration for statuses.
 * @author M.Mucha
 *
 */
public enum Result {
	SUCCESS( "SUCCESS" ),
	FAILED( "FAILED" ),
	ERROR( "ERROR" );

	private String result;
	
	Result( String result ) {
		this.setResult( result );
	}

	public String getResult() {
		return result;
	}
	private void setResult( String result ) {
		this.result = result;
	}	
}