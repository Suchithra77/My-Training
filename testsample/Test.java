package testsample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\USER\\eclipse-workspace\\My_Maven\\src\\main\\resources\\test.properties");
		Properties p = new Properties();
		p.load(fr);
		System.out.println(p.getProperty("userid"));
		System.out.println(p.getProperty("pwd"));
		
		p.setProperty("email", "abc@gmail.com");
		FileWriter f = new FileWriter("C:\\Users\\USER\\eclipse-workspace\\My_Maven\\src\\main\\resources\\test.properties");
		p.store(f, "personal info");
		Properties p1 = new Properties();
		p1.setProperty("phn", "123456789");
		p1.store(new FileWriter("info.properties"), null);
		
	}

}
