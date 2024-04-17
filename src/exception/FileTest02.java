package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest02 {

	public static void main(String[] args) {

		// 파일 2가지 종류 : 바이너리 파일(이미지,영상, 음원등), 텍스트 파일(글씨)
		// 바이너리파일 경우 byte 단위, 텍스트 파일 경우 char 단위

		FileReader fr = null;
		try {// 지역변수
			fr = new FileReader("몽여름"); // 예외가 발생할 예상 구간, 문제가 발생시 catch로 넘어감
			System.out.println("try구간");

		} catch (FileNotFoundException e) {

			System.out.println("---FileNotFoundException 발생-----");

			// e.printStackTrace();
			System.out.println("catch구간");

		} finally {// 무조건 실행구간

			System.out.println("무조건 실행되는 finally 구간");

			try {
				if (fr != null) {

					fr.close();// NullPointerException 예상 구간

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("---IOException 발생-----");
				// e.printStackTrace();
			}
			System.out.println("finally 마지막 구간");

		}

	}

}
