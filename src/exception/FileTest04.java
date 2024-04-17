package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest04 {

	public static void main(String[] args) {
		
		
		
		
		
		//try-with-resources
		try (FileWriter fw = new FileWriter("몽여름")) {

			System.out.println("try구간");
			fw.close();
			System.out.println("close()실행");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
