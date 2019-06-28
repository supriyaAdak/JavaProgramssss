package AddressBook;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonMappingException;

public interface Manager 
{

	

	

	

 void sortByName(File  file) throws JsonMappingException, IOException;

	void sortByZip(File  file) throws JsonMappingException, IOException;

	void print(File  file, String name) throws JsonMappingException, IOException;

	

}
