package exception;

class Point {

	int x;
	int y;
}

public class RuntimeExceptionTest{

	public static void main(String[] args) {

		//Exception - RuntimeException제외한 나머지는 일반적으로 CheckedException라 한다.
 
		//RuntimeException : 실행 되어야만 알수있음 -> 컴파일러가 체크하지 못해요.

		//try{}catch(Exception e){}finally{} 예외처리과정

		//throws 예외전가-> 여기서 예외처리 하지 않고 예외처리방법을 다른곳으로 넘긴다.

		String name = null;

		// char ch=name.charAt(0);

		Point point = null;

		point = new Point();

//메소드 호출(실행)

		if (point != null) displayPoint(point);
		else System.out.println("Point가 에러나는 구간입니다");

	}

	private static void displayPoint(Point point) {

		System.out.println("x : " + point.x);

		System.out.println("y : " + point.y);

	
	}

}
