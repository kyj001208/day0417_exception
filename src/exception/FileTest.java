package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileTest {

	public static void main(String[] args) {
		
		//생성자에 throws FileNotFoundException  선언되어 있어서 컴파일러가 체크해줘요
		try {
			FileInputStream fis =new FileInputStream("여름몽");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일이 존재하지 않습니다");
			e.getMessage();
		}
		
	
		
	}

}
