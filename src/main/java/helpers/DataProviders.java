package helpers;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import java.io.FileReader;
import java.io.IOException;

public class DataProviders {
	private static final String URL = "testData/url";

	public static String provideTestData(String fileName, String datas) {

		JSONParser parser = new JSONParser();
		String output = "";
		try (FileReader reader = new FileReader(fileName + ".json")) {
			Object obj = parser.parse(reader);
			JSONObject data = (JSONObject) obj;
			output = (String) data.get(datas);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return output;
	}
	
	public static String getUrlTestData(String URLName) {
		return provideTestData(URL, URLName);
		
	}
}
