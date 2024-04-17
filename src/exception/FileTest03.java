package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest03 {

	public static void main(String[] args) {
		
		
		
		
		

		try (FileReader fr = new FileReader("몽여름")) {

			System.out.println("try구간");
			fr.close();

		} catch (FileNotFoundException e) {

			System.out.println("---FileNotFoundException 발생-----");

			// e.printStackTrace();
			System.out.println("catch 마지막 구간");

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
