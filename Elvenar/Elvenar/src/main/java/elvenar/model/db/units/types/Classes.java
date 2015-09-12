package elvenar.model.db.units.types;
/**
 * Entity for classes.
 * @author M.Mucha
 *
 */
public class Classes {
	private int classId;
	private String name, description;

	public Classes() {}

	public int getClassId() {
		return classId;
	}
	public void setClassId( int classId ) {
		this.classId = classId;
	}
	public String getName() {
		return name;
	}
	public void setName( String name ) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription( String description ) {
		this.description = description;
	}
}