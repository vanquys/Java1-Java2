
public class SeverException extends Exception {
	public  SeverException() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		System.out.println("error");
		return  "Connection Faile";
	}
	
}
