package getFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFile {

	public static void checkExistingFile() {
		String path = "C1:\\Users\\bouti\\eclipse-workspace\\practical2\\properties file\\examfile.properties";
		try {
			// create new files
			File f = new File(path);

			// create new file in the system
			f.createNewFile();

			// tests if file exists
			f.exists();

			// prints
			System.out.println("File exists");

		} catch (IOException e) {
			System.out.println("File does not exist");
			e.printStackTrace();

		}

	}
			
	public static void main(String[] args) {
		String path = "C:\\Users\\bouti\\eclipse-workspace\\practical2\\properties file\\examfile.properties";
		
		checkExistingFile();
		
		try (FileInputStream input = new FileInputStream(path)) {

			Properties prop = new Properties();

			// load a properties file
			prop.load(input);

			System.out.println("");

			// get the property values and print them out
			System.out.println(prop.get("Word1"));
			System.out.println(prop.get("Meaning_1"));
			System.out.println(prop.get("Meaning_2"));
			System.out.println(prop.get("Word2"));
			System.out.println(prop.get("Meaning1"));
			System.out.println(prop.get("Meaning2"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
		
	}


