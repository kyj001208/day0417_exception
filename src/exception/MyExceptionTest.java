package exception;

public class MyExceptionTest {
	
	
	static int [] arr={10,20,30};

	public static void main(String[] args) {
		
	
		try {
			System.out.println(get(0));
			System.out.println(get(1));
			System.out.println(get(2));
			
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(get1(-1));
		System.out.println(arr[-1]);
		
		Object obj=Integer.valueOf(10);
		
		if(obj instanceof Integer) {
			
			Integer num=(Integer) obj;
			
		}
		
		Double num2=(Double) obj;
		
	}

	private static int get(int i) throws MyException {
		
		if(i<0 || i>arr.length) {
			
			throw new MyException("사이즈 범위 오바");
		}
		
		return arr[i];

	}
	
	
	private static int get1(int i) throws MyRuntimeException {
		
		if(i<0 || i>arr.length) {
			
			throw new MyRuntimeException("사이즈 범위 오바");
		}
		
		return arr[i];

	}



}
