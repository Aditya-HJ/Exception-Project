package exeptionHandl;

public class Arithmetic {
	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		
		try {
		int div=num1/num2;
		}
		
		catch(ArithmeticException ae) {
		System.out.println(ae+"It is Arithmetic Exception");
		ae.printStackTrace();
		}
		finally {
		System.out.println("Executes even when exception occurs or not");
		}
		System.out.println("Rest of the code");
	}
}