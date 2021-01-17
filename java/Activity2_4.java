package javaActivity_2;

public class Activity2_4 {

	public static void main(String[] a) throws Exception {
		// TODO Auto-generated method stub

		try {
			Activity2_4.exceptionTest("Print to console");
			Activity2_4.exceptionTest(null);
			Activity2_4.exceptionTest("Won't Execute");			
		}catch(CustomException exc) {
			System.out.println("Inside Catch Block" +exc.getMessage());
		}
		
	}

	static void exceptionTest(String str) throws Exception{
		
		if(str==null) {
			throw new CustomException("String value is null");
		}else {
			System.out.println(str);
		}
	}
}

class CustomException extends Exception {
	
	private String message = null;
	
	public CustomException(String message) {
		this.message = message;	
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}