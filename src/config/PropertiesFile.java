package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.FirstSeleniumClass;

public class PropertiesFile {

	static Properties prop = new Properties();

	public static void main(String[] args) {

		readPropertiesFiles();
		writePropertiesFile();
	}

	public static void readPropertiesFiles() {

		Properties prop = new Properties();

		try {

			InputStream input = new FileInputStream("/Users/ericklopez/eclipse-workspace/Selenium/src/config/config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			FirstSeleniumClass.browser = prop.getProperty("browser");
			System.out.println(FirstSeleniumClass.browser);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writePropertiesFile() {

		try {
			OutputStream output = new FileOutputStream(
					"/Users/ericklopez/eclipse-workspace/Selenium/src/config/config.properties");

			prop.setProperty("browser", "chrome");
			prop.store(output, null);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
