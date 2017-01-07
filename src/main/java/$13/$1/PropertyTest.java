package $13.$1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
		OutputStream output = null;

		try {
			File f = new File("config.properties");
			System.out.println("path:" + f.getAbsolutePath());
			output = new FileOutputStream(f);

			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "mkyong");
			prop.setProperty("dbpassword", "password");

			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
