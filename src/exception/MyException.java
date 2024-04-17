package exception;


class MyRuntimeException extends RuntimeException{
	
	public MyRuntimeException(String message) {
		
		super(message);
	}
}



public class MyException extends Exception {

	public MyException(String message) {
		
		super(message);
		
	}

}
