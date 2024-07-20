package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileHandler {
	static PropertyFileHandler propertyFileHandler;
	static Properties Prop = new Properties();

	private PropertyFileHandler() {

	}

	/***
	 * This method is to return the PropertyFileHandler object
	 * 
	 * @author Amila_Wijerathna
	 * @return
	 */
	public static PropertyFileHandler getPropertyFileHandler() {
		if (propertyFileHandler == null) {
			propertyFileHandler = new PropertyFileHandler();
		}
		return propertyFileHandler;
	}

	/***
	 * This method is to load the property file
	 * 
	 * @author Amila_Wijerathna
	 * @param path
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void loadPropertyFile(String path) throws FileNotFoundException, IOException {
		System.out.println("Load Property File");
		Prop.load(new FileInputStream(path));
	}

	/***
	 * This method is used to read the property file.
	 * 
	 * @author Amila_Wijerathna
	 * @param key
	 * @return
	 */
	public static String readProperty(String key) {
		return Prop.getProperty(key);
	}

	/***
	 * This method is used to write the property file.
	 * 
	 * @author Amila_Wijerathna
	 * @param key,
	 *            value
	 * @return
	 */
	public static void writeProperty(String key, String value) {
		Prop.setProperty(key, value);
		
	}
}
