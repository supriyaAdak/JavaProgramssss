package CommercialDataProcessing;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface Stock_Interface {
	public void addNew() throws JsonGenerationException, IOException;

	public void addNewUser();

	public void displayTranscationDetails() throws JsonParseException, JsonMappingException, IOException;

	public void transcationDetails(String id, String symbol1, int total);

	public void removeData();

	public void buyShares(String symbol, int total);

	public void removeUserData();

	public void displayInformation() throws JsonParseException, JsonMappingException, IOException;

	public void displayUserInformation() throws JsonParseException, JsonMappingException, IOException;

	public void saveFile(CommercialCompany com);

	public void saveUserFile(CommercialUser user1);
}
