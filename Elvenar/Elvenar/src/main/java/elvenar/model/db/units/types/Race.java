package elvenar.model.db.units.types;
/**
 * Entity for race.
 * @author M.Mucha
 *
 */
public class Race {
	private int raceId;
	private String name;

	public Race() {}

	public int getRaceId() {
		return raceId;
	}
	public void setRaceId( int raceId ) {
		this.raceId = raceId;
	}
	public String getName() {
		return name;
	}
	public void setName( String name ) {
		this.name = name;
	}
}