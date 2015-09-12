package pmp;

public class ActivityLog {
	private Integer id, activity_id, type, category_id, activity_type_id, status;
	private String parent_id, line_number, area, result, result_parameters, cpe_id;
	
	public ActivityLog() {
		setBaseValues();
	}
	
	public Integer getActivity_id() {
		return activity_id;
	}
	public void setActivity_id( Integer activity_id ) {
		this.activity_id = activity_id;
	}
	public Integer getType() {
		return type;
	}
	public void setType( Integer type ) {
		this.type = type;
	}
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id( Integer category_id ) {
		this.category_id = category_id;
	}
	public Integer getActivity_type_id() {
		return activity_type_id;
	}
	public void setActivity_type_id( Integer activity_type_id ) {
		this.activity_type_id = activity_type_id;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus( Integer status ) {
		this.status = status;
	}
	public String getParent_id() {
		return parent_id;
	}
	public void setParent_id( String parent_id ) {
		this.parent_id = parent_id;
	}
	public String getLine_number() {
		return line_number;
	}
	public void setLine_number( String line_number ) {
		this.line_number = line_number;
	}
	public String getArea() {
		return area;
	}
	public void setArea( String area ) {
		this.area = area;
	}
	public String getResult() {
		return result;
	}
	public void setResult( String result ) {
		this.result = result;
	}
	public String getResult_parameters() {
		return result_parameters;
	}
	public void setResult_parameters( String result_parameters ) {
		this.result_parameters = result_parameters;
	}
	public String getCpe_id() {
		return cpe_id;
	}
	public void setCpe_id( String cpe_id ) {
		this.cpe_id = cpe_id;
	}
	public Integer getId() {
		return id;
	}
	public void setId( Integer id ) {
		this.id = id;
	}
	private void setBaseValues() {
		setActivity_id( 0 );
		setType( 0 );
		setCategory_id( 0 );
		setActivity_type_id( 0 );
		setStatus( 0 );
		setParent_id( "0" );
		setLine_number( "0" );
		setArea( "0" );
		setResult( "0" );
		setResult_parameters( "0" );
		setCpe_id( "0" );
		setId( 0 );
	}
}