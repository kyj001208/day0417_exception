package exception;

import java.util.Scanner;


public class RuntimeExceptionTest02 {

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);
		System.out.println("나눗셈을 하기위한 수를 분자 분모 순으로 입력하세요");
		int a = in.nextInt();
		int b = in.nextInt();
		
		
		/*
		while(b==0) {
			
			System.out.println("분모가 0일수는 없어요\n분모만 다시 입력하세요");
			
			b=in.nextInt();
		}
		 */
		
		
		
		/*
		if(b==0) {
			System.out.println("0으로 나누지 마세요");
			return; //아래메서드는 실행하지 말고 여기서 종료하세요
		}
		 */
		int result = divide3(a, b);
		System.out.println(a + "/" + b + "=" + result);

	}
	
	private static int divide3(int a, int b) throws Exception{
		
		int result=a/b;
		return result;
	}
	
	private static int divide2(int a, int b) {
		
		int result=0;
		try {
			result=a/b; //예외가 발생할수 있는 예상구간 
			
		}catch(Exception e) {
			
			//e.printStackTrace();
			System.out.println("0으로 나눌수 없어요\n 프로그램 종료");
			System.exit(0);
		}

		return result ; //소숫점 나오지 않아요 정수만 나오고 나머지는 버림.
		//0으로 나눌 시 ArithmeticException 발생
	}

	private static double divide(int a, int b) {

		// 부동소수점 산술 위한 규칙 : Infinity, NaN
		return (double) a / b;
	}

}
