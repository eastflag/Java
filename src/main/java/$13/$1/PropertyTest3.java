package $13.$1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyTest3 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			String filename = "config.properties";
			input = PropertyTest3.class.getClassLoader().getResourceAsStream(filename);
			if (input == null) {
				System.out.println("Sorry, unable to find " + filename);
				return;
			}

			// load a properties file from class path, inside static method
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty("database"));
			System.out.println(prop.getProperty("dbuser"));
			System.out.println(prop.getProperty("dbpassword"));

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
