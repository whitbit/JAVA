package pwir_l_07_08d.model.dataFromFiles;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarName extends SetDataFromFiles {
	private final static List< String > carNameList = new ArrayList< String >();
	private final static String CAR_NAMES_PATH = "C:/Users/ullQuiorra/GitHub/PWiR/pwir_l_07_08d/src/pwir_l_07_08d/model/DataFromFiles/carNames";
	
	public CarName() throws IOException {
		setDataToList( CAR_NAMES_PATH, carNameList );
	}

	public List< String > getNameList() {
		return carNameList;
	}
}
