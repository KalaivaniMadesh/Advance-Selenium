package GentricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility extends WebdriverUtility{

	public static String propertyData(String key) throws IOException {
		FileInputStream fis = new FileInputStream(IConstant.property_path);
		
		p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
}
