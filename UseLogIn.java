package exeptionHandl;

public class UseLogIn {
	
	public static void main(String[] args) throws LogInValidation {
		String username="admin";
		String password="123";
		try {
		if(username.equals("admin") && password.equals("12345")) {
			System.out.println("Login Successful");
		}
		else {
			throw new LogInValidation("Login Failed");
		}
		}
		catch(LogInValidation a) {
		System.out.println(a);
		}
		System.out.println("further execution");
	}
}
